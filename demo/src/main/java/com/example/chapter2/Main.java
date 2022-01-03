package com.example.chapter2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // FindInt
        int[] data = {
            1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        if (FindInt.find(data, 5)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found...");
        }

        // SimpleDatabase
        try {
            SimpleDatabase db = new SimpleDatabase(new FileReader("demo/src/main/java/com/example/chapter2/dbfile.txt"));
            Iterator<String> it = db.iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("KEY: \"" + key + "\"");
                System.out.println("VALUE: \"" + db.getValue(key) + "\"");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
