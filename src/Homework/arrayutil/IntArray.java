package Homework.arrayutil;

public class IntArray {
    public static void main(String[] args) {

        int[] array = {3, 6, 9, 1, 5, 8, 44, 63, 21};
        int a = array[0];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]){
                    a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

