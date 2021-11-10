package ru.mirea.task12;

public class Test {
    public static void main(String[] args) {
//		Object[][]arr = {{"Bee", 6}, {"Cow", 4}, {"Doggy", 7}, {"Bzzz", 1}, {"Rabbit", 8}};
        SortingStudentsByGPA students = new SortingStudentsByGPA(new Object[][]{{"Bee", 6}, {"Cow", 4}, {"Doggy", 7}, {"Bzzz", 1}, {"Rabbit", 8}});
        students.quickSort(0, students.sp.length - 1);
        System.out.println("Sorted list: ");
        for (Object[] j : students.sp) {
            System.out.println(j[0] + " " + j[1]);
        }
    }
}