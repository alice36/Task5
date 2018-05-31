public class Task5_5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 101; i++) {
            if (i%2==0) {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("Suma liczb parzystych wynosi: " + sum);
    }
}
