package com.example.chapter15;

import java.io.*;
import java.util.regex.*;

public abstract class CSVReader {
    private final BufferedReader _bufReader;
    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");

    protected CSVReader(BufferedReader bufReader) {
        _bufReader = bufReader;
    }

    public String[] readCSV() throws IOException {
        String line = _bufReader.readLine();
        if (line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    public void close() throws IOException {
        _bufReader.close();
    }
}
