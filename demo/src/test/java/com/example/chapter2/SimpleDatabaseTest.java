package com.example.chapter2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

public class SimpleDatabaseTest {
    private static String FILENAME = "testfile.txt";

    @BeforeEach
    public void setUp() throws IOException {
        PrintWriter writer = new PrintWriter(FILENAME);
        writer.println("user1@example.com=user1");
        writer.println("user2@example.com=user2");
        writer.println("user3@example.com=user3");
        writer.close();
    }

    @AfterEach
    public void tearDown() throws IOException {
        new File(FILENAME).delete();
    }

    @Test
    public void testFound() throws IOException {
        SimpleDatabase db = new SimpleDatabase(new FileReader(FILENAME));
        String expected = "user1";
        String actual = db.getValue("user1@example.com");
        assertEquals(expected, actual);
    }

    @Test public void testNotFound() throws IOException {
        SimpleDatabase db = new SimpleDatabase(new FileReader(FILENAME));
        String expected = null;
        String actual = db.getValue("admin@example.com");
        assertEquals(expected, actual);
    }
}
