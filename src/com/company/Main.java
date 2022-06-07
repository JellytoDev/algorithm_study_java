package com.company;

import java.util.*;

public class Main {

    public String solution(String number, int k) {
        int idx = 0;
        char max;
        StringBuilder answer = new StringBuilder();

        if(number.charAt(0) == '0') return "0";
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = idx; j <= k + i; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j); idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
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
