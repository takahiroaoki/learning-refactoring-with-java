package com.example.chapter15;

import java.io.*;

public class CSVStringReader extends CSVReader {
    public CSVStringReader(String string) {
        super(new BufferedReader(new StringReader(string)));
    }
}
