package Homeworke.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }
        System.out.println();

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a > max) {
                max = a;

            }

        }
        System.out.println(max);


        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a < min)
                min = a;

        }
        System.out.println(min);


        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0)
                System.out.println(array[i]);

        }
        System.out.println();

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println(a);

        System.out.println();

        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0)
                b++;

        }
        System.out.println(b);

        System.out.println();

        double c;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k += array[i];
        }
        c = k / array.length;
        System.out.println(c);
    }

}











