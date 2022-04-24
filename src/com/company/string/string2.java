//package com.company.string;
//
//import com.company.Main;
//
//import java.util.Scanner;
//
//
// // foreach lowerCase, uppserCase 이론
//public class string2 {
//    public String solution(String str) {
//        String answer="";
//
//        for (char x : str.toCharArray()) {
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//}
