package com.Model.HotelManagment;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;


public class CalculateNumberOfUniqueWords {
    public static void main(String... args) throws FileNotFoundException {
        try {
            int numberOfUniqueWords = 0;
            int nonUniqueWords = 0;
            File file = new File("HotelSolvd/src/main.java/resources/repeating_words.txt");
            List<String> readFile = FileUtils.readLines(file, StandardCharsets.UTF_8);
            Iterator<String> iterator = readFile.iterator();

            while (iterator.hasNext()) {
                if (iterator.equals(iterator.next())) {
                    nonUniqueWords++;
                } else {
                    numberOfUniqueWords++;
                }
            }
            FileUtils.writeStringToFile(file, String.valueOf(numberOfUniqueWords), true);
            System.out.println(numberOfUniqueWords);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}