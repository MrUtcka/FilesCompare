package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileCompare {

    int differences = 0;
    int maxLenght;
    byte[] first, second;

    public fileCompare(String first, String second) throws IOException {
        this.first = Files.readAllBytes(Paths.get(String.valueOf(first)));
        this.second = Files.readAllBytes(Paths.get(String.valueOf(second)));
    }

    public void Compare() {
        try {
            if(first.length < second.length) { maxLenght = first.length; }
            else { maxLenght = second.length; }

            for (int i = 0; i < maxLenght; i++) {
                if (first[i] != second[i]) {
                    System.out.println((char) first[i] + " ! " + (char) second[i]);
                    differences++;
                }
                else { System.out.println((char) first[i] + " = " + (char) second[i]); }
            }

            if (first.length < second.length) {
                for (int i = maxLenght; i < second.length; i++) {
                    System.out.println(" != " + (char) second[i]);
                    differences++;
                }
            }
            else {
                for (int i = maxLenght; i < first.length; i++) {
                    System.out.println((char) first[i] + " != ");
                    differences++;
                }
            }
        }
        catch (Exception err) {
            err.printStackTrace();
        }

        System.out.println("Кол-во различий: " + differences);
    }
}
