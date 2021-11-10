package ru.mirea.task8.Picture;
import javax.swing.*;
import java.awt.*;
public class Picture  extends JFrame{

    public Picture(String name, String path) {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1000, 1000);
        frame.setVisible(true);
        frame.add(new MyComponents(path));
    }
    static class MyComponents extends JComponent {
        private String path;
        public MyComponents (String path){
            this.path = path;
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image image  = new ImageIcon(path).getImage();
            g.drawImage(image, 0, 0, null);
        }
    }
    public static void main(String[] args){
        Picture abc = new Picture("picture", "D:\\acd\\lol.png");
    }
}

