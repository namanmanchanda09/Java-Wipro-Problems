package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String str = var.next();
        char[] arr = str.toCharArray();
        int k = var.nextInt();
        int ans=0;
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for(int i=0;i<k;i++){
            if(m.containsKey(arr[i])){
                int temp = m.get(arr[i]);
                temp++;
                m.put(arr[i],temp);
            }else{
                m.put(arr[i],1);
            }
        }
        if(m.size()==k){
            ans++;
        }
        for(int i=k;i<str.length();i++){
            if(m.containsKey(arr[i])){
                int temp = m.get(arr[i]);
                temp++;
                m.put(arr[i],temp);
            }else{
                m.put(arr[i],1);
            }

            int initial = m.get(arr[i-k]);
            initial--;
            m.put(arr[i-k],initial);
            if(m.get(arr[i-k])==0){
                m.remove(arr[i-k]);
            }
            if(m.size()==k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}







