package com.company;

import java.util.*;

/*
설명

알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는

문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.

단 반복횟수가 1인 경우 생략합니다.


입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 압축된 문자열을 출력한다.


예시 입력 1
KKHSSSSSSSE

예시 출력 1
K2HS7E

예시 입력 2
KSTTTSEEKFKKKDJJGG

예시 출력 2
KST3SE2KFK3DJ2G2
*/
// substring과 Integer.paseInt(2진수, 10진수 변환) replace, nextLine으로 입력받으면 정상적으로 안됨 등
// 문자열 나눠야 하는 경우 for문 말고 replace로 해야함
public class Main {
    public String solution(int num,String str) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int answerNum = Integer.parseInt(tmp, 2);
            answer += (char) answerNum;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(num,str));
    }
}
