package com.company;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int a = var.nextInt();
        int d = a;
        d /= 10;
        int b = var.nextInt();
        int e = b;
        e /= 10;
        int c = var.nextInt();
        int f = c;
        f /= 10;
        int units = 1000000;
        int tens = 1000000;
        int hundreds = 1000000;
        int thousands = 0;
        units = Math.min(a % 10, b % 10);
        thousands = Math.max(a % 10, b % 10);
        units = Math.min(units, c % 10);
        thousands = Math.max(thousands, c % 10);
        tens = Math.min(d % 10, e % 10);
        thousands = Math.max(thousands, d % 10);
        thousands = Math.max(thousands, e % 10);
        tens = Math.min(tens, f % 10);
        thousands = Math.max(thousands, f % 10);
        d /= 10;
        e /= 10;
        f /= 10;
        hundreds = Math.min(d % 10, e % 10);
        thousands = Math.max(thousands, d % 10);
        thousands = Math.max(thousands, e % 10);
        hundreds = Math.min(hundreds, f % 10);
        thousands = Math.max(thousands, f % 10);
        int answer = (thousands * 1000) + (hundreds * 100) + (tens * 10) + units;
        System.out.println(answer);
    }
}




























































