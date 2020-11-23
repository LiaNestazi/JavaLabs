package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> arr = new ArrayList<>();
        for (T e : elements)
            arr.add(e);

        return arr;
    }
    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T e : elements)
            set.add(e);

        return set;
    }
    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size())
            throw new IllegalArgumentException();
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=newArrayList(new Integer(27),new Integer(19));
        HashSet<Integer> set=newHashSet(new Integer(10),new Integer(15));
        List<Integer> lst1=newArrayList(new Integer(1),new Integer(2));
        List<Integer> lst2=newArrayList(new Integer(17),new Integer(29));
        HashMap<Integer,Integer> map=newHashMap(lst1,lst2);
        System.out.println(arr);
        System.out.println(set);
        System.out.println(map);
    }
}
