package com.example.chapter14;

import java.io.IOException;
import java.util.*;

public class AddressFile {
    private final Database _database;
    public AddressFile(String filename) {
        _database = new Database(filename);
    }
    public String get(String key) {
        return _database.get(key);
    }
    public void set(String key, String value) {
        _database.set(key, value);
    }
    public void update() throws IOException {
        _database.update();
    }
    public Enumeration<String> names() {
        return _database.getKeys();
    }
}
