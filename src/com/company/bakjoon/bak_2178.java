//package com.company;
//
//import java.util.*;
//
///*
// */
//// 피보나치 수열
//public class Main {
//
//    static int n;
//    static int m;
//    static boolean[][] visited;
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        m = kb.nextInt();
//
//        int[][] arr = new int[n][m];
//        visited = new boolean[n][m];
//
//        for (int i = 0; i < n; i++) {
//            String nl = kb.next();
//            int j=0;
//            for (char c : nl.toCharArray()) {
//                arr[i][j] = c-48;
//                visited[i][j] = false;
//                j++;
//            }
//        }
//
//        int answer = T.bfs(0, 0, arr);
//        System.out.println(answer);
//    }
//
//    public static class Point{
//        public int x;
//        public int y;
//        public int cnt;
//        Point(int x, int y,int cnt) {
//            this.x = x;
//            this.y = y;
//            this.cnt = cnt;
//        }
//    }
//
//    int[] dx = {1, -1, 0, 0};
//    int[] dy = {0, 0, 1, -1};
//
//    public int bfs(int x,int y,int[][] arr) {
//        // 0이면 이동 할 수 없다. 1이면 이동 가능
//        int answer = 0;
//
//        Queue<Point> q = new LinkedList<>();
//
//        q.offer(new Point(x,y,1));
//
//        while (!q.isEmpty()) {
//            Point tmp = q.poll();
//
//            if (tmp.x == m - 1 && tmp.y == n - 1) {
//                return tmp.cnt;
//            }
//
//            for (int i = 0; i < 4; i++) {
//                int nx = tmp.x + dx[i];
//                int ny = tmp.y + dy[i];
//
//                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
//                    if (arr[ny][nx] != 0 && visited[ny][nx] != true) {
//                        //System.out.println("nx = " + nx + " ny = "+ny + " cnt = "+ tmp.cnt + " arr = "+ arr[ny][nx]);
//                        visited[ny][nx] = true;
//                        q.offer(new Point(nx,ny,tmp.cnt+1));
//                    }
//                }
//            }
//        }
//
//        return 1;
//    }
//
//}
