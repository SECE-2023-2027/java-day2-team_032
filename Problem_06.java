import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[count] = arr[i];  
                count++;
            }
        }
        System.out.println("The length of the new array is: " + count);
        System.out.print("Updated array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}