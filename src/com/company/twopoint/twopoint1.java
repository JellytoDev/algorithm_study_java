//package com.company;
//
//import java.util.*;
//
///*
//1. 두 배열 합치기
//설명
//
//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
//
//두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
//
//세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
//
//네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
//
//각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
//
//
//출력
//오름차순으로 정렬된 배열을 출력합니다.
//
//
//예시 입력 1
//3
//1 3 5
//5
//2 3 6 7 9
//
//예시 출력 1
//1 2 3 3 5 6 7 9
//
//*/
//// 코드 줄이기, ++ 같은거는 안에 합쳐버린다, for문보다 while문 조건 식 사용하자
//public class Main {
//    public ArrayList<Integer> solution2(int arr1_num, int arr2_num, int[] arr1, int[] arr2) {
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        int arr1_dir = 0;
//        int arr2_dir = 0;
//
//        while (arr1_dir < arr1_num-1 && arr2_dir < arr2_num-1) {
//            //System.out.println("arr1[arr1_dir] = " + arr1[arr1_dir]+" "+arr2[arr2_dir]+" "+arr1_dir+" "+arr2_dir);
//            if (arr1[arr1_dir] < arr2[arr2_dir]) {
//                answer.add(arr1[arr1_dir]);
//                arr1_dir++;
//            } else if (arr1[arr1_dir] > arr2[arr2_dir]) {
//                answer.add(arr2[arr2_dir]);
//                arr2_dir++;
//            } else if (arr1[arr1_dir] == arr2[arr2_dir]) {
//                answer.add(arr1[arr1_dir]);
//                answer.add(arr2[arr2_dir]);
//                arr1_dir++;
//                arr2_dir++;
//            }
//        }
//
//        if (arr1_dir < arr1_num) {
//            for (int i = arr1_dir; i < arr1_num; i++) {
//                answer.add(arr1[i]);
//            }
//        }
//        if (arr2_dir < arr2_num) {
//            for (int i = arr2_dir; i < arr2_num; i++) {
//                answer.add(arr2[i]);
//            }
//        }
//
//        return answer;
//    }
//
//    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        int p1=0, p2=0;
//        while(p1<n && p2<m){
//            if(a[p1]<b[p2]) answer.add(a[p1++]);
//            else answer.add(b[p2++]);
//        }
//        while(p1<n) answer.add(a[p1++]);
//        while(p2<m) answer.add(b[p2++]);
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        int arr1_num = kb.nextInt();
//        int[] arr1 = new int[arr1_num];
//        for (int i = 0; i < arr1_num; i++) {
//            arr1[i] = kb.nextInt();
//        }
//
//        int arr2_num = kb.nextInt();
//        int[] arr2 = new int[arr2_num];
//        for (int i = 0; i < arr2_num; i++) {
//            arr2[i] = kb.nextInt();
//        }
//
//        ArrayList<Integer> solution = T.solution(arr1_num,arr2_num,arr1,arr2);
//        for (Integer x : solution) {
//            System.out.print(x+" ");
//        }
//        //System.out.println(T.solution(studentNum,testNum,grade));
//    }
//}
