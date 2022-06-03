package com.company;

import java.util.*;

public class Main {

    public String solution(String number, int k) {
        String answer = "";

        char[] chars = number.toCharArray();
        int len = k;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < chars.length; i++) {
            int tmp = chars[i] - '0';
            //System.out.println("len = " + len+" i : "+i);
            if (i <= len && max < tmp) {
                max = tmp;
            }

            if (i >= len) {
                //System.out.println("max = " + max);
                answer += max;
                len++;
                max = Integer.MIN_VALUE;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String number = "1924";
        String number2 = "1231234";
        String number3 = "4177252841";

        int k = 2;
        int k2 = 3;
        int k3 = 4;

        System.out.println(T.solution(number3,k3));
        //T.solution(n,number);

    }


}
