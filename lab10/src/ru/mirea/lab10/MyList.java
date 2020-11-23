package ru.mirea.lab10;

public class MyList<E> {
    private int size;
    private Object[] elements;
    public MyList(int size){
        elements=new Object[size];
        this.size=0;
    }
    public void add(E e){
        if (size<elements.length){
            elements[size]=e;
        }else {
            Object[] temp=elements;
            elements=new Object[size+1];
            elements=temp;
            elements[size]=e;
        }
        size++;
    }
    public E get(int index){
        if (index>=size)
            throw new IndexOutOfBoundsException("Index: "+index+ " Size:"+size);
        return (E)elements[index];
    }
    public int getSize(){
        return size;
    }

    public String toString() {
        String str="";
        str+= "[";
        String s=elements[0].toString();
        str+=s;
        for (int i=1;i<size;i++) {
            s=elements[i].toString();
            str+=", "+s;
        }
        str+=']';
        return str;
    }

    public static void main(String[] args) {
        int x=27;
        int x2=19;
        long y=201243;
        long y2=210613;
        MyList<Object> list=new MyList<Object>(5);
        list.add(x);
        list.add(y);
        list.add(x2);
        list.add(y2);
        System.out.println(list);
    }
}
