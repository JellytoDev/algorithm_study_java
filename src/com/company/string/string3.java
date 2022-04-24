//package com.company.string;
//
//import com.company.Main;
//
//import java.util.Scanner;
//

// // Integer.MIN_VALUE 개념, max min 개념

//public class string3 {
//    public String solution(String str) {
//        String answer="";
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for (String x: s) {
//            if (m < x.length()){
//                m = x.length();
//                answer = x;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();
//        System.out.println(T.solution(str));
//    }
//}
