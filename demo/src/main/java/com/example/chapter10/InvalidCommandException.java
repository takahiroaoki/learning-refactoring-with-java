package com.example.chapter10;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {
    }
}
