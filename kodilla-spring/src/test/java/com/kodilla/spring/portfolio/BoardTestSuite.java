package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("ToDoTask3");
        board.getInProgressList().addTask("InProgressTask4");
        board.getDoneList().addTask("DoneTask2");

        //Then
        Assert.assertEquals("ToDoTask3", board.getToDoList().getTasks().get(2));
        Assert.assertEquals("InProgressTask4", board.getInProgressList().getTasks().get(3));
        Assert.assertEquals("DoneTask2", board.getDoneList().getTasks().get(1));
    }
}
