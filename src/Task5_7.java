import java.util.Scanner;

public class Task5_7 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String[] tab = new String[5];

        for (int i=1; i<6; i++){
            System.out.println("Podaj imie " + i);
            tab[i-1] = input.nextLine();
        }
        for (int i=4; i>=0; i--){
            System.out.println("Cześć " + tab[i]);
        }
    }
}
