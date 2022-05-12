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
//class Pointer implements Comparable<Pointer>{
//    public int x, y;
//    Pointer(int x, int y){
//        this.x=x;
//        this.y=y;
//    }
//
//    @Override
//    public int compareTo(Pointer o) {
//        if(this.x==o.x) return this.y - o.y;
//        else return this.x - o.x;
//    }
//}
//
//public class Main {
//
//    //static class Pointer {
//    //    int x;
//    //    int y;
//    //
//    //    public Pointer(int x, int y) {
//    //        this.x = x;
//    //        this.y = y;
//    //    }
//    //
//
//
//    public void solution2(int n, ArrayList<Pointer> pointers) {
//        //ArrayList<Integer> answer = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (pointers.get(i).x > pointers.get(j).x) {
//                    Collections.swap(pointers, i, j);
//                } else if (pointers.get(i).x == pointers.get(j).x) {
//                    if (pointers.get(i).y > pointers.get(j).y) {
//                        Collections.swap(pointers, i, j);
//                    }
//                }
//            }
//        }
//
//        for (Pointer pointer : pointers) {
//            System.out.println(pointer.x + " " + pointer.y);
//        }
//
//        //return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        int n = kb.nextInt();
//
//        ArrayList<Pointer> pointers = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int x = kb.nextInt();
//            int y = kb.nextInt();
//
//            Pointer pointer = new Pointer(x, y);
//            pointers.add(pointer);
//
//        }
//
//        Collections.sort(pointers);
//        for(Pointer o : pointers) System.out.println(o.x+" "+o.y);
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        //System.out.println(T.solution(n, arr));
//
//        //T.solution(n, pointers);
//    }
//}
