package java2;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class eleventh_program {
 public static void main(String[] a){
    Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = sc.nextInt();

        // TreeMap keeps keys sorted (alphabetically by default)
        Map<String, Integer> studentMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Input Student Name, ID, Score: ");
            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            studentMap.put(name + " " + id, score);
        }

        // Initialize highest and lowest
        String highestStudent = null;
        String lowestStudent = null;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();

            if (score > highestScore) {
                highestScore = score;
                highestStudent = student;
            }
            if (score < lowestScore) {
                lowestScore = score;
                lowestStudent = student;
            }
        }
        System.out.println("Name, ID of the highest score and the lowest score:");
        System.out.println(highestStudent);
        System.out.println(lowestStudent);
 }   
}
