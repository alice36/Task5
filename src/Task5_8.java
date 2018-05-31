import java.util.Scanner;

public class Task5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 0, sum1 = 0, sum2 = 0, sum3 = 0;
        int max=0, row=0;
        int[][] tab = new int[3][3];

        while (i < 3) {
            while (j < 3) {
                System.out.println("Podaj liczbe (" + i + "," + j + ")");
                tab[i][j] = input.nextInt();
                j++;
            }
            if (i==0) sum1 = tab[i][0] + tab[i][1] + tab[i][2];
            if (i==1) sum2 = tab[i][0] + tab[i][1] + tab[i][2];
            if (i==2) sum3 = tab[i][0] + tab[i][1] + tab[i][2];
            i++;
            j=0;
        }
        if (sum1 > sum2 && sum1 > sum3) {
            max = sum1;
            row = 1;
        } else if (sum2 > sum1 && sum2 > sum3) {
            max = sum2;
            row = 2;
        } else if (sum3 > sum1 && sum3 > sum2) {
            max = sum3;
            row = 3;
        }
        System.out.println("Największa suma liczb jest w wierszu " + row + " i wynosi " + max + ".");
    }
}
