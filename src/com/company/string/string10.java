//package com.company.string;
//
//import com.company.Main;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
///*
//설명
//
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
//
//
//예시 입력 1
//teachermode e
//
//예시 출력 1
//1 0 1 2 1 0 1 2 2 1 0
//*/
//// List 초기화 system.out.print, system.out.println 차이
//public class string10 {
//    public List<Integer> solution(String str, char c) {
//        List<Integer> answer = new ArrayList<>(Collections.nCopies(str.length(),0));
//
//        Integer cnt = 10000;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == c) cnt =0;
//            answer.set(i, cnt);
//            cnt++;
//        }
//        cnt = 10000;
//        for (int i = str.length()-1; i >=0; i--) {
//            if(str.charAt(i) == c) cnt =0;
//            if(answer.get(i) > cnt) answer.set(i, cnt);
//
//            cnt++;
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str1 = kb.next();
//        char c = kb.next().charAt(0);
//        List<Integer> solution = T.solution(str1, c);
//        for (int i = 0; i < solution.size(); i++) {
//            System.out.print(solution.get(i)+" ");
//        }
//    }
//}
