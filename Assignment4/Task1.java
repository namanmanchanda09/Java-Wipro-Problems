package com.company;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int[] fib = new int[1000001];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=1000000;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.print(fib[n-1]);
    }
}