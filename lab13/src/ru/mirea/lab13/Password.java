package ru.mirea.lab13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        String password;
        Scanner scan=new Scanner(System.in);
        password=scan.nextLine();
        Pattern p=Pattern.compile("(?=^(\\w+){8,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*$");
        Matcher m=p.matcher(password);
        System.out.println(m.matches());
    }
}
