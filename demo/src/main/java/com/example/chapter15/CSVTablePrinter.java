package com.example.chapter15;

import java.io.*;

public class CSVTablePrinter extends CSVPrinter {
    public CSVTablePrinter(CSVReader csvReader) {
        super(csvReader);
    }

    @Override
    public void print() throws IOException {
        System.out.println("<table>");
        while (true) {
            String[] item = _csvReader.readCSV();
            if (item == null) {
                break;
            }
            System.out.print("<tr>");
            for (int column = 0; column < item.length; column++) {
                System.out.print("<td>");
                System.out.print(item[column]);
                System.out.print("</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}
