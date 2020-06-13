package com.company;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int rem = 0;
        while(n>0){
            rem = n%10;
            if(m.containsKey(rem)){
                int temp = m.get(rem);
                temp++;
                m.put(rem,temp);
            }else{
                m.put(rem,1);
            }
            n/=10;
        }
        AtomicInteger even = new AtomicInteger();
        AtomicInteger odd = new AtomicInteger();
        m.forEach((k,v)->{
            if(v%2==0){
                even.getAndIncrement();
            }else{
                odd.getAndIncrement();
            }
        });
        int val = odd.get();
        if(val==0 || val==1){
            System.out.print(2);

        }else{
            System.out.print(1);
        }
    }
}
























































