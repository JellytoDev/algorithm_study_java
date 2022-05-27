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
//    static int[][] arr;
//
//    static ArrayList<Integer> aparts = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//
//        arr = new int[n][n];
//        visited = new boolean[n][n];
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
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j] == 1 && visited[i][j] == false){
//                    System.out.println("i = " + i+" j = "+j);
//                    aparts.add(T.bfs(i,j));
//                }
//            }
//        }
//
//        System.out.println("apart.size() = " + aparts.size());
//        for (Integer apart : aparts) {
//            System.out.println("apart = " + apart);
//        }
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
//    public int bfs(int x,int y) {
//        // 0이면 이동 할 수 없다. 1이면 이동 가능
//        int answer = 1;
//
//        Queue<Point> q = new LinkedList<>();
//
//        q.offer(new Point(x,y,1));
//        visited[x][y] =true;
//        Point tmp;
//        while (!q.isEmpty()) {
//            tmp = q.poll();
//
//            for (int i = 0; i < 4; i++) {
//                int nx = tmp.x + dx[i];
//                int ny = tmp.y + dy[i];
//
//                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
//                    if (arr[nx][ny] == 1 && visited[nx][ny] != true) {
//                        System.out.println("nx = " + nx + " ny = "+ny + " answer = "+ answer + " arr = "+ arr[ny][nx]);
//                        visited[nx][ny] = true;
//                        answer++;
//                        q.offer(new Point(nx,ny,tmp.cnt+1));
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//
//}
