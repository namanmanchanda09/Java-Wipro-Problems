package com.company;
import javax.sound.midi.SysexMessage;
import java.awt.*;
import java.nio.Buffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        String sentence = var.nextLine();
        String[] arr = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char[] str = s.toCharArray();
            int sum = 0;
            int start = 0;
            int end = s.length() - 1;
            while(start<=end){
                if(start == end){
                    sum += (str[start] - 'a' + 1);
                }else{
                    sum += ((str[start]-'a'+1)-(str[end]-'a'+1));
                }
                start++;
                end--;
            }
            ans.append(sum);
        }
        System.out.print(ans);
    }
}










































































