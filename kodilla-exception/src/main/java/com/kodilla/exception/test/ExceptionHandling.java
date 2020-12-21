package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling handler = new ExceptionHandling();
        handler.runSecondChallenge(2, 1.5);
    }

    public String runSecondChallenge(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
            System.out.println(result);
            return result;

        } catch (Exception e) {
            String result = "Error";
            System.out.println(result);
            return result;

        }
    }
}



