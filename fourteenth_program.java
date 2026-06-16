package java2;

import java.util.Scanner;

public class fourteenth_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the month (1-12):");
        int month = sc.nextInt();

        System.out.println("Input date (1-31):");
        int day = sc.nextInt();
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid date!");
            return;
        }
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayIndex = (totalDays + 3) % 7; 
        System.out.println("Name of the date:");
        System.out.println(weekDays[dayIndex]);
    
}
}