package com.example.chapter3;

import java.util.Random;

public class Main {
    private static final Random random = new Random(1234);

    private static void execute(int length) {
        // 乱数でデータを作成
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(data.length);
        }

        // ソート前のデータを表示
        SortSample sorter = new SortSample(data);
        System.out.println("BEFORE:" + sorter);

        // ソート後のデータを表示
        sorter.sort();
        System.out.println(" AFTER:" + sorter);
        
        System.out.println();
    }

    public static void main(String[] args) {
        execute(10);
        execute(10);
        execute(10);
        execute(10);
        execute(10);
    }
}
