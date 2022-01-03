package com.example.chapter2;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDatabase {
    private Map<String,String> _map = new HashMap<String,String>();
    private static Pattern _pattern = Pattern.compile("([^=]+)=(.*)");

    public SimpleDatabase(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                Matcher matcher = _pattern.matcher(line);
                if (matcher.matches()) {
                    String key = matcher.group(1);// before "="
                    String value = matcher.group(2);// after "="
                    _map.put(key, value);    
                }
            }
        }
    }
    public void putValue(String key, String value) {
        _map.put(key, value);
    }
    public String getValue(String key) {
        return _map.get(key);
    }
    public Iterator<String> iterator() {
        return _map.keySet().iterator();
    }
}
