package ru.mirea.task2.AuthorInsteadOfBook;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author - name " + getName() + " gender " + getGender() + "at " + getEmail();
    }
    public static void main(String[] args) {
        Author a1 = new Author("Anastasya", "jhufh@gmail.com", 'F');
        Author a2 = new Author("Tolstoy", "idonthaveone@yandex.ru", 'U');
        a1.setEmail("thisismyemail@gmail.com");
        System.out.println(a1);
    }
}