package ru.geekbrains.qa.java2.lesson2;

public class MyArrayDataException extends Exception {

    private int iii;
    private int jjj;

    public MyArrayDataException(int i, int j) {
        iii = i;
        jjj = j;
    }

    public void metod () {
        System.out.println(iii + ":" + jjj);
    }
}