package com.kodilla.spring.testing.shape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Before;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests were finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("This is the " + testCounter + " test");
    }
    @DisplayName("Test for adding figure")
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector testList = new ShapeCollector(Arrays.asList(
                new Circle(23),
                new Triangle(12, 18)));

        //When
                testList.addFigure(new Square(12));

        //Then
        List<Shape> expectedList =  new ArrayList<>(Arrays.asList(
                new Circle(23),
                new Triangle(12, 18),
                new Square(12)));

        Assert.assertEquals(expectedList,testList.getList()) ;
    }
    @DisplayName("Test for removing figure")
    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(Arrays.asList(
                circle, triangle, square));

        //When
        testList.removeFigure(square);

        //Then
        List<Shape> expectedList = Arrays.asList(
                new Circle(23),
                new Triangle(12, 18));


        Assert.assertEquals(expectedList, testList.getList());

    }
    @DisplayName("Test for getting figure")
    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ShapeCollector testList = new ShapeCollector(Arrays.asList(
                circle, triangle, square));

        //When
        Shape shape1=testList.getFigure(1);
        Shape shape2=testList.getFigure(-1);
        Shape shape3=testList.getFigure(3);


        //Then
        Assert.assertEquals(triangle, shape1);
        Assert.assertEquals(null, shape2);
        Assert.assertEquals(null, shape3);
    }
    @DisplayName("Test for showing figure")
    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(23);
        Triangle triangle = new Triangle(12, 18);
        Square square = new Square(12);

        ArrayList<Shape> testList= new ArrayList<>(Arrays.asList(
                circle, triangle, square));

        ShapeCollector shapesCollection = new ShapeCollector(testList);

        //When and Then
        Assert.assertEquals(testList,shapesCollection.showFigures());
    }
}
