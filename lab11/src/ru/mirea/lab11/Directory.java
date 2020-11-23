package ru.mirea.lab11;

import java.io.File;
import java.util.ArrayList;

public class Directory {
    public static void listFiles(String path, ArrayList<File> list){
        File dir=new File(path);
        if (dir.isDirectory()){
            for (File file:dir.listFiles()){
                if (!file.isDirectory()){
                    list.add(file);
                }
            }
        }
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<File> list=new ArrayList<File>();
        listFiles("C:/Users/ПК/Desktop",list);
    }
}
