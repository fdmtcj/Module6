package com.kodilla.spring.exception.main;

import com.kodilla.spring.exception.io.FileReader;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}


