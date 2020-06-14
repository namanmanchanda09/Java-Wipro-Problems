package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String s = var.nextLine();
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}















































