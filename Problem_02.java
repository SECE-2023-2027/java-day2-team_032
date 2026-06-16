import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The sum of first 100 prime numbers : ");
        int sum = 0;
        for (int i = 2, count = 0; count < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
    }
}
