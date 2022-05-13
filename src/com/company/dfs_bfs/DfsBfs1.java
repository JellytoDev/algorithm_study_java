//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
///*
//10. 마구간 정하기(결정알고리즘)
//설명
//
//N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
//
//현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
//
//가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
//
//C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
//
//둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
//
//
//출력
//첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
//
//
//예시 입력 1
//5 3
//1 2 8 4 9
//
//예시 출력 1
//3
//    */
////
//public class Main {
//
//    public int solution(int n, int m){
//        int answer=0;
//
//        Queue<Integer> queue = new LinkedList<>();
//        ArrayList<Integer> check = new ArrayList<>();
//
//        int[] jump = {1, -1, 5};
//
//        queue.offer(n);
//        check.add(n);
//
//        while (!queue.isEmpty()) {
//            int len = queue.size();
//            for (int i = 0; i < len; i++) {
//                Integer prevDist = queue.poll();
//                if(prevDist == m) return answer;
//                for (int j = 0; j < jump.length; j++) {
//                    int dist = prevDist + jump[j];
//                    if (!check.contains(dist)) {
//                        //System.out.println("dist = " + dist);
//                        queue.offer(dist);
//                    }
//                }
//            }
//            answer++;
//        }
//
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        System.out.println(T.solution(n, m));
//
//        //T.solution(n, pointers);
//    }
//}
