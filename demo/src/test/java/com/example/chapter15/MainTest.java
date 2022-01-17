package com.example.chapter15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testMain() {
        Main.main(new String[0]);

        String expected = getExpectedOutput(
            "<table>",
            "<tr><td>おはよう</td><td>Good morning.</td></tr>",
            "<tr><td>こんにちは</td><td>Hello.</td></tr>",
            "<tr><td>こんばんは</td><td>Good evening.</td></tr>",
            "<tr><td>おやすみ</td><td>Good night.</td></tr>",
            "</table>",
            "java",
            "    applet",
            "        Applet",
            "        AppletContext",
            "    awt",
            "        ActiveEvent",
            "        Button",
            "        Canvas",
            "        color",
            "            ColorSpace",
            "        datatransfer",
            "            Clipboard",
            "        event",
            "            ActionEvent",
            "            ActionListener",
            "    io",
            "        BufferedInputStream",
            "        BufferedOutputStream",
            "    lang",
            "        Object",
            "        String",
            "        StringBuffer",
            "    util",
            "        ArrayList",
            "        EventListener",
            "        Map",
            "        jar",
            "            JarInputStream",
            "            JarOutputStream",
            "        logging",
            "            Formatter",
            "            Logger",
            "        regex",
            "            Pattern",
            "        zip",
            "            CheckedInputStream",
            "            CheckedOutputStream");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }
}
