package ru.mirea.task4.Author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String Name, String Email, char Gender) {
        name = Name;
        gender = Gender;
        setEmail(Email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + "(" + gender + ") at " + email;
    }
    public static void main(String[] args) {
        Author author1 = new Author("Ayn Rand", "a.rand@example.com", 'f');
        System.out.println(author1.toString());
        author1.setEmail("a.rand@example.ru");
        System.out.println(author1.toString());
    }
}
