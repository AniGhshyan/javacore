package group1.lesson7;

public class IfElseIf {

    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Autumn";
        else if (month == 9 || month == 10 || month == 11)
            season = "Summer";
        else
            season = "Imaginary month";

        System.out.println("April iz a " + season + " month " +  ".");
    }


}
