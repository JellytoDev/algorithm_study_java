//package com.company;
//
//import java.util.*;
//
///*
//4. 후위식 연산(postfix)
//설명
//
//후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
//
//만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
//
//
//입력
//첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
//
//식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
//
//출력
//연산한 결과를 출력합니다.
//
//
//예시 입력 1
//352+*9-
//
//예시 출력 1
//12
//*/
////
//public class Main {
//
//    public int solution(int n, int m){
//        int answer = 0;
//
//        Queue<Integer> queue = new LinkedList<>();
//
//        for (int i = 1; i <= n; i++) queue.offer(i);
//
//        int cnt = 0;
//        while (queue.size() != 1) {
//            cnt++;
//            if (cnt == m) {
//                queue.poll();
//                cnt = 0;
//            } else {
//                Integer tmp = queue.poll();
//                queue.offer(tmp);
//            }
//        }
//
//        answer = queue.poll();
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
//        //ArrayList<Integer> solution = T.solution(n,m,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(n,m));
//    }
//}
