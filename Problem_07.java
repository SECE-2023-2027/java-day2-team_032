import java.util.Arrays;
import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String-1: ");
        String s1 = sc.next();
        System.out.print("String-2: ");
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);
    }
}