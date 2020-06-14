package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String s = var.nextLine();
        int n = var.nextInt();
        char[] arr= s.toCharArray();
        int sum = 0;
        if(n==0){
            for(int i = 0 ; i < s.length() ; i++){
                if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                    continue;
                }else{
                    sum += (arr[i] - 'a' + 1);
                }
            }
        }else{
            for(int i = 0 ; i < s.length() ; i++){
                sum += (arr[i] - 'a' + 1);
            }
        }
        System.out.print(sum);
    }
}




















































