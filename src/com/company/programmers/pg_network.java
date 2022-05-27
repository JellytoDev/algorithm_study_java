//package com.company;
//
//import java.util.*;
//
//public class Main {
//
//    static int n;
//    static boolean[] visited;
//    static int[][] arr;
//
//    public static int solution(int n, int[][] computers) {
//        int answer = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (visited[i] == false) {
//                dfs(i,n, computers);
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public static void dfs(int start,int n, int[][] computers) {
//        visited[start] = true;
//        for (int i = 0; i < n; i++) {
//            if(start == i) continue;
//            if (computers[start][i] == 1 && visited[i] == false) {
//                dfs(i,n, computers);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        n = 3;
//        arr = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//        int[][] arr2 = new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
//        visited = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            visited[i] = false;
//        }
//
//        solution(n, arr2);
//
//    }
//
//
//}
