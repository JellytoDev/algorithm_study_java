package com.company;

import java.util.Scanner;

public class Main {
    public String[] solution(String[] str) {
        String[] answer=new String[str.length];

        for (int i = 0; i < str.length; i++) {
            StringBuffer sb = new StringBuffer(str[i]);
            String reverse = sb.reverse().toString();
            answer[i] = reverse;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        Integer cnt = Integer.valueOf(kb.nextLine());
        String[] str = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            str[i] = kb.next();
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(T.solution(str)[i]);
        }
    }
}
