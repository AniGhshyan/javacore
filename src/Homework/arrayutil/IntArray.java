package Homework.arrayutil;

public class IntArray {

    public static void main(String[] args) {

        int[] array = {3, 6, 9, 1, 5, 8, 44, 63, 21};
        int a = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                a = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;
            }

            System.out.print(array[i] + " ");
        }
        System.out.println();

        int b = array[0];
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                b = array[i];
                array[i] = array[i + 1];
                array[i + 1] = b;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int c = array[0];
        for (int i = 0; i < array.length - 3; i++) {
            if (array[i] > array[i + 1]) {
                c = array[i];
                array[i] = array[i + 1];
                array[i + 1] = c;
            }
            System.out.print(array[i] + " ");

        }

    }
}