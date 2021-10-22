package Homework;

public class CharArray {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        int num = 0;
        char c = 'o';
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                num++;
            }
        }
        System.out.println("1. 'o' սինվոլի քանակը = " + num);

        System.out.println("2. Մասիվի մեջտեղի 2 սինվոլներն են");
        System.out.print("    " + bolola[(bolola.length - 1) / 2] + " ");
        System.out.println(bolola[(bolola.length - 1) / 2 + 1]);

        boolean k = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
                k = true;
            }
        }
        System.out.println("3. " + k);
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                bob = true;
            }
        }
        System.out.println("4. " + bob);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int a = 0;
        int b = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') break;
            a++;
        }
        for (int i = text.length; i < 0; i--) {
            if (text[i] != ' ') break;
            b++;
        }
        char[] result = new char[text.length - (a + b)];
        for (int i = a; i < text.length - (a + b); i++) {
            result[i] = text[i];
            System.out.print("5." + result[i] + " ");
        }
    }
}





