package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        if(n==0){
            System.out.print(1);
        }
        else {
            Set<Integer> s = new HashSet<Integer>();
            int rem = 0;
            while (n > 0) {
                rem = n % 10;
                s.add(rem);
                n /= 10;

            }
            System.out.print(s.size());
        }
    }
}




































