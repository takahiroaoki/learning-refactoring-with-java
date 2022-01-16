package com.example.chapter14;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("demo/src/main/java/com/example/chapter14/address.txt");
            file.set("Hiroshi Yuki", "hyuki@example.com");
            file.set("Tomura", "tomura@example.com");
            file.set("Hanako Sato", "hanako@example.com");
            file.update();

            Enumeration<String> e = file.names();
            while (e.hasMoreElements()) {
                String name = (String)e.nextElement();
                String mail = file.get(name);
                System.out.println("name=" + name + ", mail=" + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
