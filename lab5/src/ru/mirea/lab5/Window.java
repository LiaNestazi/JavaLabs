package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private int width=500;
    private int height=500;
    public Window(String arg){
        setTitle("Draw Picture");
        ImageIcon img=new ImageIcon(arg);
        JLabel lbl = new JLabel("",img,SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width,height));
        panel.add(lbl);
        getContentPane().add(panel);
        setSize(img.getIconWidth(),img.getIconHeight());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Window wd = new Window(args[0]);
    }
}
