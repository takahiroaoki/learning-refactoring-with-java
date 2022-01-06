package com.example.chapter6;

public class Author {
    private String _authorName;
    private String _authorMail;
    
    public Author(String authorName, String authorMail) {
        _authorName = authorName;
        _authorMail = authorMail;
    }

    public String getAuthorName() { return _authorName; }
    public String getAuthorMail() { return _authorMail; }
    public void setAuthorName(String name) { _authorName = name; }
    public void setAuthorMail(String mail) { _authorMail = mail; }
}
