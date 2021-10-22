package Homework;

public class CharArray {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        int a = 0;
        char c = 'o';
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                a++;
            }
        }
        System.out.println("'o' սինվոլի քանակը = " + a);

        System.out.println("Մասիվի մեջտեղի 2 սինվոլներն են");
        System.out.print(bolola[(bolola.length - 1) / 2] + " ");
        System.out.println(bolola[(bolola.length - 1) / 2 + 1]);

        boolean k = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
                k = true;
            }
        }
        System.out.println(k);
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean b = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                b = true;
            }
        }
        System.out.println(b);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int l = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                l++;
            }
        }
        char[] result = new char[text.length - l];
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + " ");
            }
        }
    }
}





