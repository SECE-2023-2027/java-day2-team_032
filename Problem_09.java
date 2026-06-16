import java.util.Arrays;
import java.util.Scanner;
public class Problem_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element : ");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println("Original Array: " + Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}