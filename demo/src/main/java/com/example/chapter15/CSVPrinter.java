package com.example.chapter15;

import java.io.IOException;

public abstract class CSVPrinter {
    protected CSVReader _csvReader;
    protected CSVPrinter(CSVReader csvReader) {
        _csvReader = csvReader;
    }
    public abstract void print() throws IOException;
}
