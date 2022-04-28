//package com.company.array;
//
///*
//5. 소수(에라토스테네스 체)
//설명
//
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//
//
//입력
//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//
//
//출력
//첫 줄에 소수의 개수를 출력합니다.
//
//
//예시 입력 1
//20
//
//예시 출력 1
//8
//
//*/
//// 배열들의 상태값 하는법, 배수일 경우 이를 체크하는 방법
//
//import com.company.Main;
//
//import java.util.Scanner;
//
//public class array5 {
//    public Integer solution(int num) {
//        Integer answer= 0;
//        int[] ch = new int[num + 1];
//        for (int i = 2; i < num; i++) {
//            if(ch[i]==0){
//                answer++;
//                for (int j = i; j <= num; j = j + i) ch[j] = 1;
//            }
//        }
//
//        //Loop1 :
//        //for (int i = 2; i < num; i++) {
//        //    int cnt =0;
//        //    for (int j = 1; j <= i; j++) {
//        //        if(i%j==0) cnt++;
//        //        if(cnt>2) continue Loop1;
//        //    }
//        //    answer++;
//        //}
//
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int num = kb.nextInt();
//
//        //ArrayList<Integer> solution = T.solution(num);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(num));
//    }
//}
