package com.kodilla.stream.book;

public  final class Book {

    private final String title;
    private final String author;
    private int yearOfPublication;
    private final String signature;

    public Book(final String title, final String author,
                final int yearOfPublication, String signature) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';

    }
}