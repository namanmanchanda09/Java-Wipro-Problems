// Sort the first half in increasing and second half in decreasing
package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int a = var.nextInt();
            arr[i] = a;
        }

        if(n%2==0) {
            Arrays.sort(arr, 0, n / 2);
            Arrays.sort(arr, n / 2, n, Collections.reverseOrder());
        }else{
            int k = (n+1)/2;
            Arrays.sort(arr, 0, k);
            Arrays.sort(arr, k, n, Collections.reverseOrder());


        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}



















