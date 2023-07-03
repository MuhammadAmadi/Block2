package org.example;

public class test2 {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        cat1.setNick("Barsik");
        cat1.setColor("black");
        cat1.setBreed("cat");
        System.out.println(cat1);

        Cats cat2 = new Cats();
        cat2.setNick("Barsik");
        cat2.setColor("black");
        cat2.setBreed("cat");
        System.out.println(cat2);

        System.out.println(cat1.equals(cat2));
    }
}
