package com.company;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int a = var.nextInt();
        int b = var.nextInt();
        int c = var.nextInt();
        int d = var.nextInt();
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        int rem = 0;
        while(a>0){
            rem = a%10;
            if(m.containsKey(rem)){
                int temp = m.get(rem);
                temp++;
                m.put(rem,temp);
            }else{
                m.put(rem,1);
            }
            a/=10;
        }
        while(b>0){
            rem = b%10;
            if(m.containsKey(rem)){
                int temp = m.get(rem);
                temp++;
                m.put(rem,temp);
            }else{
                m.put(rem,1);
            }
            b/=10;
        }
        while(c>0){
            rem = c%10;
            if(m.containsKey(rem)){
                int temp = m.get(rem);
                temp++;
                m.put(rem,temp);
            }else{
                m.put(rem,1);
            }
            c/=10;
        }
        while(d>0){
            rem = d%10;
            if(m.containsKey(rem)){
                int temp = m.get(rem);
                temp++;
                m.put(rem,temp);
            }else{
                m.put(rem,1);
            }
            d/=10;
        }
        AtomicInteger maxValue= new AtomicInteger();
        AtomicInteger maxKey= new AtomicInteger();
        m.forEach((k,v)->{
            if(v > maxValue.get()){
                maxValue.set(v);
                maxKey.set(k);
            }else if(v==maxValue.get() && k>maxKey.get()){
                maxKey.set(k);
            }
        });
        System.out.print(maxKey.get());
    }
}

























































