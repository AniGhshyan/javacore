package Homeworke.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.print("max = " + max);


        System.out.println();

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.print("min = " + min);

        System.out.println();

        System.out.println("Մասիվի զույգ տարրերն են");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println("Մասիվի կենտ տարրերն են");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println("Մասիվի զույգ տարրերի քանակ.");
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
        }
        System.out.print(a);

        System.out.println();

        System.out.println("Մասիվի կենտ տարրերի քանակ.");
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0)
                b++;
        }
        System.out.print(b);

        System.out.println();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Միջին թվաբանականը = " + sum / array.length);
    }

}











