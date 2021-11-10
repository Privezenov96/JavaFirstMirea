package ru.mirea.task15.FileUse;

import java.io.*;
import java.util.Scanner;

public class FileUse  {
    FileUse() {
        // System.out.println(f.isFile());
        try(FileWriter writer = new FileWriter("File.txt", false))
        {
            System.out.println("Введите строку");
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args)
    {
        FileUse a = new FileUse();
    }
}
