package java2;
import java.util.Scanner;
public class twelveth_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of rows/columns (0 to exit): ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Exit");
            return;
        }

        int[][] table = new int[n][n];

        // Input table values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = sc.nextInt();
            }
        }

        // Arrays to store row sums and column sums
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int grandTotal = 0;

        // Calculate sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += table[i][j];
                colSum[j] += table[i][j];
                grandTotal += table[i][j];
            }
        }

        // Print table with row sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d", table[i][j]);
            }
            System.out.printf("%-5d\n", rowSum[i]);
        }

        // Print column sums + grand total
        for (int j = 0; j < n; j++) {
            System.out.printf("%-5d", colSum[j]);
        }
        System.out.printf("%-5d\n", grandTotal);
    }
}


