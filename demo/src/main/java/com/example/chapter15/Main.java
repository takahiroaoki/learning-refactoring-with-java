package com.example.chapter15;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String SAMPLE_CSV_STRING =
            "おはよう,Good morning.\n"
            + "こんにちは,Hello.\n"
            + "こんばんは,Good evening.\n"
            + "おやすみ,Good night.\n";

        String SAMPLE_CSV_FILE = "demo/src/main/java/com/example/chapter15/file.csv";

        try {
            new CSVTablePrinter(new CSVStringReader(SAMPLE_CSV_STRING)).print();
            new CSVTreePrinter(new CSVFileReader(SAMPLE_CSV_FILE)).print();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
