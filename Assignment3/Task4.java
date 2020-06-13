package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static void sieve(int n){
        int ans = 0;
        boolean[] isPrime = new boolean[1000001];
        int[] primes = new int[1000001];
        for(int i=1;i<=1000000;i++){
            isPrime[i]=true;
        }
        isPrime[1]=false;
        for(int i=1;i*i<=1000000;i++){
            if(isPrime[i]==true){
                for(int j=i*i;j<=1000000;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int index = 1;
        for(int i=1;i<=1000000;i++){
            if(isPrime[i]==true){
                primes[index] = i;
                index++;
            }
        }

        System.out.print(primes[n]);
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        sieve(n);
    }
}































