package ru.mirea.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMail {
    public static void main(String[] args) {
        String email;
        Scanner scan=new Scanner(System.in);
        email=scan.nextLine();
        Pattern p=Pattern.compile("([a-zA-Z]+)([0-9]*)@([a-zA-Z]+)([0-9]*).([a-zA-z]+)([0-9]*)(.?)([a-zA-Z]*)([0-9]*)");
        Pattern rootPattern=Pattern.compile("(root)@(\\w+)");
        Matcher m=p.matcher(email);
        Matcher m2=rootPattern.matcher(email);
        System.out.println(m.matches()||m2.matches());
    }
}
