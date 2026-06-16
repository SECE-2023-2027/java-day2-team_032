package java2;

import java.util.Scanner;

public class thirteen_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string:");
        String input = sc.nextLine();

        // Use a temporary placeholder to avoid conflicts
        String temp = input.replace("python", "TEMP");
        temp = temp.replace("java", "python");
        temp = temp.replace("TEMP", "java");

        System.out.println("New string:");
        System.out.println(temp);
    }
}
