package com.kodilla.stream.immutable;

public final class Book {
    private final String title;
    private final String author;
    private final int yearOfPublification;

    public Book(final String title, final String author, final int yearOfPublification) {
        this.title = title;
        this.author = author;
        this.yearOfPublification = yearOfPublification;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublification() {
        return yearOfPublification;
    }
}
