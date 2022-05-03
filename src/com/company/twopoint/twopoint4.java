//package com.company;
//
//import java.util.*;
//
///*
//4. 연속 부분수열
//설명
//
//N개의 수로 이루어진 수열이 주어집니다.
//
//이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
//
//만약 N=8, M=6이고 수열이 다음과 같다면
//
//1 2 1 3 1 1 1 2
//
//합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
//
//
//입력
//첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
//
//수열의 원소값은 1,000을 넘지 않는 자연수이다.
//
//
//출력
//첫째 줄에 경우의 수를 출력한다.
//
//
//예시 입력 1
//8 6
//1 2 1 3 1 1 1 2
//
//예시 출력 1
//3
//
//*/
//// 모든 경우를 생각하자
//public class Main {
//
//    //정답
//    public int solution(int n, int k, int[] arr){
//        int answer = 0;
//        int st=0,et = 0;
//
//        // 1 1 1 1 1 2 2 3
//        while (et < n && st < n) {
//            //System.out.println("st = " + st +" "+et);
//            int sum=0;
//            for (int i = st; i <= et; i++) {
//                sum += arr[i];
//            }
//
//            if(sum==k){
//                answer++;
//                et++;
//            }
//            else if(sum>k) st++;
//            else et++;
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        //ArrayList<Integer> solution = T.solution(arr1_num,arr2_num,arr1,arr2);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(n,m,arr));
//    }
//}
