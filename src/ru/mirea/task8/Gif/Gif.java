package ru.mirea.task8.Gif;

import javax.swing.*;

public class Gif extends JFrame {

    public Gif() {
        Icon icon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\Gif\\GIF.gif");
        JLabel label = new JLabel(icon);
        JFrame f = new JFrame("Open gif");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Gif();
    }
}