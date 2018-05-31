import java.util.Scanner;

public class Task5_4 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String quarter="";

        System.out.println("Podaj X");
        int x = input.nextInt();
        System.out.println("Podaj Y");
        int y = input.nextInt();

        if (x>0 && y>0) quarter = "I";
        if (x<0 && y<0) quarter = "III";
        if (x>0 && y<0) quarter = "IV";
        if (x<0 && y>0) quarter = "II";

        System.out.println("Punkt (" + x +"," + y + ") leży w " + quarter + " ćwiartce układu współrzędnych.");
    }
}
