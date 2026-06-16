import java.util.Scanner;
public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.next();
        int[] a = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(a[s.charAt(i)-'a']==1){
                System.out.println("First Unique Character : " + s.charAt(i));
                return ;
            }
        }
    }
}
