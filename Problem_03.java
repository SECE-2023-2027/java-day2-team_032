import java.util.Scanner;
public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String s1 = sc.next();
        System.out.print("Enter the String 2 : ");
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if(i==0)continue;
            sb.append(s1.charAt(i));
        }
        n = s2.length();
        for (int i = 0; i < n; i++) {
            if(i==0)continue;
            sb.append(s2.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
