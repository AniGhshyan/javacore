package group1.lesson7;

public class MissingBreak {

    public static void main(String[] args) {

        for (int i = 0; i < 12; i++)
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i < 10");
                    break;
                default:
                    System.out.println("i >= 10");
            }

        }

    }


