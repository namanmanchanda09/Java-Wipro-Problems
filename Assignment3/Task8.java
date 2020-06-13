package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int even = 0;
        int odd = 0;
        int rem = 0;
        while (n > 0) {
            rem = n%10;
            if(rem%2 == 0){
                even+=rem;
            }else{
                odd+=rem;
            }
            n/=10;
        }
        System.out.print("Even : " + even + " Odd : " + odd);
    }
}









































