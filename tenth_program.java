package java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tenth_program {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int q = sc.nextInt();
            l.add(q);
        }
        
        if(l.size() >= 2) {
            System.out.println(l.get(0).equals(l.get(l.size() - 1)));
        } else {
            System.out.println("Array length must be at least 2");
        }
    }
}
