import java.util.Scanner;

public class Task5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 0, k=0;
        int sumMax = 0, sumTmp=0;
        int maxRow=0;
        int[][] tab = new int[3][3];

        while (i < tab.length) {
            while (j < tab.length) {
                System.out.println("Podaj liczbe (" + i + "," + j + ")");
                tab[i][j] = input.nextInt();
                if (j==2){
                    while (k < tab.length){
                        sumTmp = sumTmp+ tab[i][k];
                        k++;
                    }
                }
                if (sumTmp>sumMax){
                    sumMax=sumTmp;
                    maxRow=i+1;
                }
                j++;
            }
            i++;
            j=0;
            k=0;
            sumTmp=0;
        }

        System.out.println("Największa suma liczb jest w wierszu " + maxRow + " i wynosi " + sumMax + ".");
    }
}
