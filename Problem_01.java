
import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seconds : ");
        int time = sc.nextInt();
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
