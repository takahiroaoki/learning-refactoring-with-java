package com.example.chapter6;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;

    public Book(String title, String isbn, String price, String authorName, String authorMail) {
        _title = title;
        _isbn = isbn;
        _price = price;
        _author = new Author(authorName, authorMail);
    }

    public String getTitle() { return _title; }
    public String getIsbn() { return _isbn; }
    public String getPrice() { return _price; }
    public String getAuthorName() { return _author.getAuthorName(); }
    public String getAuthorMail() { return _author.getAuthorMail(); }
    public void setAuthorName(String name) { _author.setAuthorName(name); }
    public void setAuthorMail(String mail) { _author.setAuthorMail(mail); }

    public String toXml() {
        String author =
            tag("author", tag("name", _author.getAuthorName()) + tag("mail", _author.getAuthorMail()));
        String book =
            tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }
    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
    // ...
}
