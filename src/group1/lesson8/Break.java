package group1.lesson8;

import java.awt.event.WindowFocusListener;

public class Break {

    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            secod:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break secod;
                }
                System.out.println("Этот оператор не будет быполняться");
            }
            System.out.println("Этот оператор следует за блоком secod:");
        }
    }
}
