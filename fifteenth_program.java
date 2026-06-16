package java2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class fifteenth_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (you can include space as well):");
        String input = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = input.toCharArray();
        char prev = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
            } else {
                map.put(prev, count);
                prev = chars[i];
                count = 1;
            }
        }
        map.put(prev, count);
        StringBuilder compressed = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            compressed.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println("The compressed string along with the counts of repeated characters is:");
        System.out.println(compressed.toString());
    }
}
