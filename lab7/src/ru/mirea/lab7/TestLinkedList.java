package ru.mirea.lab7;

import java.util.LinkedList;

public class TestLinkedList {
    public static class Song{
        private String author;
        private String name;
        public Song(String name, String author){
            this.name=name;
            this.author=author;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return name+" - "+author;
        }
    }
    public static void main(String[] args) {
        LinkedList<Song> songs=new LinkedList<Song>();
        songs.add(new Song("Dimple","BTS"));
        songs.add(new Song("DNA","BTS"));
        Song dyn=new Song("Dynamite","BTS");
        songs.addLast(dyn);
        songs.addFirst(new Song("MIC Drop","BTS"));
        songs.add(0,new Song("Spring Day","BTS"));
        for (Song song:songs){
            System.out.println(song);
        }
        if (songs.contains(dyn)){
            System.out.println("Dy-na-na-na-na");
        }
        songs.removeFirst();
        songs.removeLast();
        for (Song song:songs){
            System.out.println(song);
        }

    }
}
