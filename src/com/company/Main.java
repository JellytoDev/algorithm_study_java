package com.company;

import java.util.*;

/*
5. 소수(에라토스테네스 체)
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.


예시 입력 1
20

예시 출력 1
8

*/
// 피보나치 수열
public class Main {
    public Integer solution(int num) {
        Integer answer= 0;

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        //ArrayList<Integer> solution = T.solution(num);
        //for (Integer x : solution) {
        //    System.out.print(x+" ");
        //}
        System.out.println(T.solution(num));
    }

    private static void characterMethodTest() {
        char ch1 ='3';
        char ch2 = 'h';
        char ch3 = ' ';
        if(Character.isDigit(ch1)) System.out.println("is digit");
        if(Character.isAlphabetic(ch2)) System.out.println("is alpha");
        if(Character.isWhitespace(ch3)) System.out.println("is space");
    }
}
