package ru.mirea.task3.Book;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private String date;

    public Book(String Title, String Author, int Isbn, String Date) {
        setTitle(Title);
        setAuthor(Author);
        setIsbn(Isbn);
        setDate(Date);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Title: " + getTitle() + "; Author: " + getAuthor() + " ISBN: " + getIsbn() + "; date: " + getDate();
    }
    public static void main(String[] args) {
        Book book1 = new Book("Atlas Shrugged", "Ayn Rand", 93939036, "12.12.1956");
        System.out.println(book1.toString());
    }
}
