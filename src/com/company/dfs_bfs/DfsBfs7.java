//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
///*
//5. 동전교환
//설명
//
//다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
//
//각 단위의 동전은 무한정 쓸 수 있다.
//
//
//입력
//첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
//
//그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
//
//
//예시 입력 1
//
//3
//1 2 5
//15
//예시 출력 1
//
//3
//힌트
//
//41
//    */
//// 콤비네이션 1 반환 조건 외우기
//public class Main {
//
//    static int n;
//    static int m;
//    //static int k;
//    int[][] arr;
//
//    static boolean flag = false;
//    static int answer=Integer.MAX_VALUE;
//
//    // 5 3 -> 4 2 / 4 1 -> 3 1 / 3 2 -> 2 1/ 2 2 -> 1 1
//    //                  -> 3 0  / 3 1
//    public int DFS(int k,int r) {
//        //System.out.println("k = " + k +" "+r);
//        if(arr[k][r]>0) return arr[k][r];
//
//        if (r == 0 || k == r) {
//            return 1;
//        } else {
//            int prev, next;
//            if (arr[k - 1][r - 1] != 0) {
//                prev = arr[k - 1][r - 1];
//            } else {
//                prev = DFS(k - 1, r - 1);
//                arr[k - 1][r - 1] = prev;
//            }
//
//            if (arr[k - 1][r] != 0) {
//                next = arr[k - 1][r];
//            } else {
//                next = DFS(k - 1, r);
//                arr[k - 1][r] = next;
//            }
//
//            return prev + next;
//        }
//    }
//
//
//    //private int solution(int n, int m, int[] arr) {
//    //
//    //    return answer;
//    //}
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        n = kb.nextInt();
//        m = kb.nextInt();
//
//        T.arr = new int[n+1][n+1];
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        answer = T.DFS(n, m);
//
//        System.out.println(answer);
//        //System.out.println(T.solution(n, m, arr));
//
//        //T.solution(n, pointers);
//    }
//}
