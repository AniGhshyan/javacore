package group1.lesson3;

public class PPromote {

    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double rezalt = (f * b) + (i / c) -(d * s );
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println(" rezalt = " + rezalt );

    }
}
