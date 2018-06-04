import java.util.Scanner;

public class Task5_6 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int x;

        while (!check){

            System.out.println("Podaj liczbę");
            x = input.nextInt();

            if (x<100) System.out.println("Podana liczba jest za mała.");
            else if (x>200) System.out.println("Podana liczba jest za duża.");
            else if (x>=100 && x<=200 && x%3==0) {
                System.out.println("Twoja liczba jest ok.");
                check = true;
            }
		else System.out.println("Liczba nie jest podzielna przez 3.");
        }
    }
}
