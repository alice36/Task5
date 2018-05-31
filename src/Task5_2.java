import java.util.Arrays;

public class Task5_2 {
        public static void main(String[] args) {
            int[] tab = new int[5];
            int sum = 0;

            tab[0]=1;
            tab[1]=2;
            tab[2]=6;
            tab[3]=9;
            tab[4]=22;

            for (int i = 0; i < tab.length; i++) {
                if (i%2==0) sum=sum+tab[i];
            }
            System.out.println(sum);
        }
}
