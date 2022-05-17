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
//// 해당 경우가 최선의 경우인지 최대의 경우인지를 파악한다.
//// return 해야 하는 경우를 파악한다.
//public class Main {
//
//    static int n;
//    static int m;
//    //static int k;
//    int[] arr;
//
//    static boolean flag = false;
//    static int answer=Integer.MAX_VALUE;
//
//    public void DFS(int total,int cnt) {
//        if(total>m) return;
//        if(cnt >= answer) return;
//        if (total == m) {
//            answer = Math.min(answer,cnt);
//            return;
//        } else {
//            for (int i = 0; i < n; i++) {
//                DFS(total + arr[i],cnt+1);
//            }
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
//
//        T.arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            T.arr[i] = kb.nextInt();
//        }
//
//        m = kb.nextInt();
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        T.DFS(0,0);
//
//        System.out.println(answer);
//        //System.out.println(T.solution(n, m, arr));
//
//        //T.solution(n, pointers);
//    }
//}
