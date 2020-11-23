package ru.mirea.lab10;

import java.util.ArrayList;

public class Convert {
    public static <E> void arrayToArrayList(E[] arr, ArrayList<E> list){
        for (E element :arr)
            list.add(element);
    }

    public static void main(String[] args) {
        Integer[] array={25,49,27,19,50};
        ArrayList<Integer> list=new ArrayList<Integer>();
        arrayToArrayList(array,list);
        System.out.println(list);
    }
}
