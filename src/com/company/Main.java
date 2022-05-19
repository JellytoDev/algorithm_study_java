package com.company;

import java.lang.reflect.Array;
import java.util.*;

/*
8. 수열 추측하기
설명

가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.

예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.

Image1.jpg

N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.

단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.


입력
첫째 줄에 두개의 정수 N(1≤N≤10)과 F가 주어진다.

N은 가장 윗줄에 있는 숫자의 개수를 의미하며 F는 가장 밑에 줄에 있는 수로 1,000,000 이하이다.


출력
첫째 줄에 삼각형에서 가장 위에 들어갈 N개의 숫자를 빈 칸을 사이에 두고 출력한다.

답이 존재하지 않는 경우는 입력으로 주어지지 않는다.


예시 입력 1
4 16

예시 출력 1
3 1 2 4
    */

public class Main {

    //public static class Vertex{
    //    public int start;
    //    public int
    //}


    public int solution(int n, int start, int end, int[][] roads, int[] traps) {
        int answer = 0;

        ArrayList<Integer> existX = new ArrayList<>();
        ArrayList<Integer> existY = new ArrayList<>();

        int[][] check = new int[n + 1][n + 1];
        int[] visited = new int[n+1];
        for (int i = 0; i < roads.length; i++) {
            check[roads[i][0]][roads[i][1]] = roads[i][2];
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = 1;

        while (!q.isEmpty()) {
            int loc = q.poll();

            for (int i = 0; i < check[loc].length; i++) {
                int next = check[loc][i];
                if (Arrays.asList(traps).contains(next)) {

                }
                if (visited[next] != 1) {
                    q.offer(next);
                    visited[next] = 1;
                }
                // trap 일 경우
            }



        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        //String str = kb.nextLine();
        int n = 3; int start = 1; int end = 3;
        int[][] roads = {{1, 2, 2}, {3, 2, 3}};
        int[] traps = {2};

        //ArrayList<Integer> solution = T.solution(n,arr);
        //for (Integer x : solution) {
        //    System.out.print(x+" ");
        //}

        System.out.println(T.solution(n,start,end,roads,traps));
    }
}
