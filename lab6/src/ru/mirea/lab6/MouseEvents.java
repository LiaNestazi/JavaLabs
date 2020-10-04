package ru.mirea.lab6;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEvents extends JFrame {
    JPanel[] pnl=new JPanel[5];
    public MouseEvents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(500,500);
        for (int i=0;i<pnl.length;i++){
            pnl[i]=new JPanel();
            pnl[i].setPreferredSize(new Dimension(130,130));
            int r=(int)(Math.random()*255);
            int g=(int)(Math.random()*255);
            int b=(int)(Math.random()*255);
            pnl[i].setBackground(new Color(r,g,b));
        }

        add(pnl[0],BorderLayout.CENTER);
        add(pnl[1],BorderLayout.WEST);
        add(pnl[2],BorderLayout.SOUTH);
        add(pnl[3],BorderLayout.NORTH);
        add(pnl[4],BorderLayout.EAST);

        pnl[0].add(new JLabel("CENTER"));
        pnl[1].add(new JLabel("WEST"));
        pnl[2].add(new JLabel("SOUTH"));
        pnl[3].add(new JLabel("NORTH"));
        pnl[4].add(new JLabel("EAST"));

        pnl[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ");
            }
        });

        pnl[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Джидда");
            }
        });

        pnl[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать Абха");
            }
        });

        pnl[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в");
            }
        });

        pnl[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Дахране");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        MouseEvents me = new MouseEvents();
    }
}
