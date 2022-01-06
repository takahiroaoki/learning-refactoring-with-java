package com.example.chapter6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        Book book = new Book(
            "The title of the book",
            "ISBNxxxx",
            "$12.34",
            "A. U. Thor",
            "author@example.com");
        String actual = book.toXml();
        String expected
            = "<book>"
                + "<title>The title of the book</title>"
                + "<isbn>ISBNxxxx</isbn>"
                + "<price>$12.34</price>"
                + "<author>"
                    + "<name>A. U. Thor</name>"
                    + "<mail>author@example.com</mail>"
                + "</author>"
            + "</book>";
        assertEquals(expected, actual);
    }
}
