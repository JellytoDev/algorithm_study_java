//package com.company.array;
//
//import com.company.Main;
//
//import java.util.Scanner;
//
///*
//9. 격자판 최대합
//설명
//
//5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
//
//Image1.jpg
//
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
//
//
//입력
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//
//
//출력
//최대합을 출력합니다.
//
//
//예시 입력 1
//
//5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19
//예시 출력 1
//
//155
//
//*/
//// Math.max, 경우의 수 나누기, 중첩 없애기
//public class array9 {
//    public int solution(int num, int[][] arr) {
//        //int answer = 0;
//        int answer = Integer.MIN_VALUE;
//        for (int i = 0; i < num; i++) {
//            int sum_hor = 0; int sum_ver = 0;
//            for (int j = 0; j < num; j++) {
//                sum_hor += arr[i][j];
//                sum_ver += arr[j][i];
//            }
//            //if(sum_hor > answer) answer = sum_hor;
//            //if(sum_ver > answer) answer = sum_ver;
//            answer = Math.max(answer, sum_hor);
//            answer = Math.max(answer, sum_ver);
//
//        }
//
//        int sum_dig = 0;
//        for (int i = 0; i < num; i++) {
//            sum_dig += arr[i][i];
//        }
//        if(sum_dig > answer) answer = sum_dig;
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int num = kb.nextInt();
//        int[][] arr = new int[num][num];
//
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//
//        //int solution = T.solution(num,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(num,arr));
//    }
//}
