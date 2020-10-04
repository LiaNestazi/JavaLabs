package ru.mirea.lab8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try(FileWriter writer=new FileWriter("src/ru/mirea/lab8/test.txt",false)){
            String text=scan.nextLine();
            writer.write(text);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
