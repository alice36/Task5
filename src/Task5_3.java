import java.util.Arrays;

public class Task5_3 {
    public static void main(String[] args) {
        String tab[] = new String[31];
        String tab2[] = new String[31];
        int i =0;

        while (i<=30){
            String result = String.format("%.1f", i*0.1);
            tab[i]= result;
            i++;
        }
        String arrayString = Arrays.toString(tab);
        System.out.println(arrayString);

        i =0;
        do {
            String result = String.format("%.1f", i*0.1);
            tab2[i]= result;
            i++;
        } while (i<=30);
        String arrayString2 = Arrays.toString(tab2);
        System.out.println(arrayString2);
    }
}
