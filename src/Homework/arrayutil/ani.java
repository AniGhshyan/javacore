package Homework.arrayutil;

public class ani {
    public static void main(String[] args) {

        int[] array = {3, 6, 9, 1, 5, 8, 44, 63, 21};
        int a = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                a = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;
            }
        }
        for (int j = 0; j < array.length; j++) {
            array[array.length - 1] = a;
            System.out.print(array[j] + " ");

        }
    }
}
