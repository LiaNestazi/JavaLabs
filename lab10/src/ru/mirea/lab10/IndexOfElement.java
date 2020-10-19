package ru.mirea.lab10;

import java.util.ArrayList;

public class IndexOfElement<E> {
    public E getElement(ArrayList<E> arr,int index){
        if (arr.size()<=index){
            throw new IndexOutOfBoundsException("Index: "+index+" Size: "+arr.size());
        }
        return (E)arr.get(index);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(12);
        arr.add(23);
        arr.add(34);
        IndexOfElement<Integer> obj=new IndexOfElement<Integer>();
        System.out.println(obj.<Integer>getElement(arr,0));
        System.out.println(obj.<Integer>getElement(arr,2));
        System.out.println(obj.<Integer>getElement(arr,1));
    }
}
