//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
///*
//7. 좌표 정렬
//설명
//
//N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
//
//정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
//
//
//입력
//첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
//
//두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
//
//
//출력
//N개의 좌표를 정렬하여 출력하세요.
//
//
//예시 입력 1
//5
//2 7
//1 3
//1 2
//2 5
//3 6
//
//예시 출력 1
//1 2
//1 3
//2 5
//2 7
//3 6
//    */
//// Comparable 상속, 사용법
//
//public class Main {
//
//    public int solution(int n, int m, int[] arr) {
//        int answer = 0;
//
//        Arrays.sort(arr);
//
//        int mid =(arr.length - 1) / 2;
//        int start = 0;
//        int end = arr.length - 1;
//
//        //for (int i : arr) {
//        //    System.out.print(i + " ");
//        //}
//
//        //1 4 7 9 11 14
//        while (m != arr[mid]) {
//            //System.out.println("arr[mid] = " + arr[mid]);
//            if (m > arr[mid]) {
//                start = mid;
//                mid = ( mid + end )/ 2;
//            } else if (m < arr[mid]) {
//                end = mid;
//                mid = ( start + mid )/ 2;
//            }
//        }
//
//        answer = mid+1;
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
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        System.out.println(T.solution(n, m, arr));
//
//        //T.solution(n, pointers);
//    }
//}
