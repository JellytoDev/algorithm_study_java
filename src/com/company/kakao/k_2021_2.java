//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
///*
//8. 수열 추측하기
//설명
//
//가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.
//
//예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
//
//Image1.jpg
//
//N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
//
//단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.
//
//
//입력
//첫째 줄에 두개의 정수 N(1≤N≤10)과 F가 주어진다.
//
//N은 가장 윗줄에 있는 숫자의 개수를 의미하며 F는 가장 밑에 줄에 있는 수로 1,000,000 이하이다.
//
//
//출력
//첫째 줄에 삼각형에서 가장 위에 들어갈 N개의 숫자를 빈 칸을 사이에 두고 출력한다.
//
//답이 존재하지 않는 경우는 입력으로 주어지지 않는다.
//
//
//예시 입력 1
//4 16
//
//예시 출력 1
//3 1 2 4
//    */
//
//public class Main {
//    //static class Point{
//    //    public int x;
//    //    public int y;
//    //
//    //    Point(int x, int y) {
//    //        this.x = x;
//    //        this.y = y;
//    //    }
//    //
//    //    public boolean isRight(Point a, Point b) {
//    //
//    //    }
//    //
//    //}
//
//    //맨해튼 거리 T1, T2가 행렬 (r1, c1), (r2, c2) 맨해튼 거리는 |r1 - r2| + |c1 - c2|
//    // 응시자 P , 빈테이블 O ,파티션 X
//    public int[] solution(String[][] places) {
//        int[] answer = new int[5];
//
//        //System.out.println("places.length = " + places.length);
//
//        for (int i = 0; i < 5; i++) {
//            Character[][] seat = new Character[5][5];
//            for (int j = 0; j < 5; j++) {
//                char[] place = places[i][j].toCharArray();
//                for (int k = 0; k < place.length; k++) {
//                    seat[j][k] = place[k];
//                }
//            }
//
//            int[] dx = {1, 2, 0, 0, 1};
//            int[] dy = {0, 0, 1, 2, 1};
//
//            boolean check = true;
//            Loop1:
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < seat.length; k++) {
//                    if (seat[j][k] == 'P') {
//                        for (int l = 0; l < 5; l++) {
//                            int nk = k + dx[l];
//                            int nj = j + dy[l];
//                            if (nk < 5 && nj < 5) {
//                                //System.out.print(seat[nj][nk]);
//                                if (seat[nj][nk] == 'P') {
//                                    if (dx[l] == 2 && seat[nj][nk - 1] == 'X') {
//
//                                    } else if (dy[l] == 2 && seat[nj - 1][nk] == 'X') {
//
//                                    } else if (dx[l] == 1 && dy[l] == 1 && seat[nj][nk - 1] == 'X' && seat[nj - 1][nk] == 'X') {
//
//                                    } else {
//                                        //System.out.println(i+" : nj = " + nj + " nk : "+nk + "dx : "+dx[l]+" dy : "+dy[l]);
//                                        check = false;
//                                        break Loop1;
//                                    }
//                                }
//                            }
//                        }
//
//
//                    }
//                }
//            }
//
//            if (check) {
//                answer[i] = 1;
//            } else {
//                answer[i] = 0;
//            }
//        }
//
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println("answer[i] = " + answer[i]);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        //String str = kb.nextLine();
//        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
//                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
//                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
//                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
//                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        System.out.println(T.solution(places));
//    }
//}
