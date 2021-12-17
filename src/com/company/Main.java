package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Путь: ");
        String firstFile = sc.next();
        System.out.print("Путь: ");
        String secondFile = sc.next();

        fileCompare flc = new fileCompare(firstFile, secondFile);

        flc.Compare();
    }
}


