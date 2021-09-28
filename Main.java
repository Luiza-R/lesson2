package ru.geekbrains.qa.java2.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void checkLength(String[][] array) throws MyArraySizeException {
        if (array.length == 4 && array[0].length == 4) {
            // nothing
        } else {
            throw new MyArraySizeException();
        }
    }
    public static int calculateSum(String[][] a) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                try {
                    sum = sum + Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] arr1 = new String[][]
                        {{"3","4","5","6"},
                        {"r","t","y","u"},
                        {"3e","e2","t6","7y"},
                        {"ff","44","jd","39"}};

        try {
            checkLength(arr1);
            int s = calculateSum(arr1);
            System.out.println(s);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            e.metod();
        }
    }
}
