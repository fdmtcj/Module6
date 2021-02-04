package com.kodilla.spring.exception.io;


import com.kodilla.spring.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbablyWillThrowExceptionTest {

  @Test
    public void shouldReturnDoneWhenValidXY() {

        //Given
      ExceptionHandling handler = new ExceptionHandling();

        //When
      String result = handler.runSecondChallenge(1.5, 2);

      //Then
      assertEquals("Done!",result);

    }

    @Test
    public void shouldReturnErrorWhenNotValidXY() {

        //Given
        ExceptionHandling handler = new ExceptionHandling();

        //When
        String result = handler.runSecondChallenge(2, 1.5);

        //Then
        assertEquals("Error",result);

    }



}
