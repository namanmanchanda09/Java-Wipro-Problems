package com.company;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            if (m.containsKey(rem)) {
                int temp = m.get(rem);
                temp++;
                m.put(rem, temp);
            } else {
                m.put(rem, 1);
            }
            n /= 10;
        }
        AtomicInteger count = new AtomicInteger();
        m.forEach((k, v) -> {
            if (v == 1) {
                count.getAndIncrement();
            }
        });
        System.out.print(count);
    }
}






































