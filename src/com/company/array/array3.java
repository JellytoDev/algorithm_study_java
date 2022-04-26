//package com.company.array;
//
//import com.company.Main;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///*
//1. 큰 수 출력하기
//설명
//
//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//
//(첫 번째 수는 무조건 출력한다)
//
//
//입력
//첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//
//
//출력
//자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
//
//
//예시 입력 1
//6
//7 3 9 5 6 12
//
//예시 출력 1
//7 9 6 12
//
//*/
//// else 통합하기, 코드 계속 줄여가기, 승/패밖에 없는 상황 else로 나눠내기
//public class array3 {
//    public ArrayList<String> solution(int num, int[] arr, int[] arr2) {
//        ArrayList<String> answer= new ArrayList<>();
//
//        for (int i = 0; i < num; i++) {
//            // A가 가위를 낸 상황
//            if(arr[i]==arr2[i]) answer.add("D");
//            else if(arr[i]==1 && arr2[i]==2) answer.add("B");
//            else if(arr[i]==2 && arr2[i]==3) answer.add("B");
//            else if(arr[i]==3 && arr2[i]==1) answer.add("B");
//            else answer.add("A");
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int num = kb.nextInt();
//        int[] arr = new int[num];
//        int[] arr2 = new int[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int i = 0; i < num; i++) {
//            arr2[i] = kb.nextInt();
//        }
//
//        ArrayList<String> solution = T.solution(num, arr, arr2);
//        for (String x : solution) {
//            System.out.println(x);
//        }
//        //System.out.println(T.solution(num, arr, arr2));
//    }
//}
