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
//    public String solution(String str1, String str2){
//        String answer = "YES";
//
//        Queue<Character> queue = new LinkedList<>();
//
//        for (int i = 0; i < str1.length(); i++) queue.offer(str1.charAt(i));
//
//        for (char c : str2.toCharArray()) {
//            //System.out.println("c = " + c);
//            if (!queue.isEmpty()) {
//                if (c == queue.peek()) queue.poll();
//            }
//        }
//
//        if(!queue.isEmpty()) answer = "NO";
//
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        String str1 = kb.nextLine();
//        String str2 = kb.nextLine();
//
//        //ArrayList<Integer> solution = T.solution(n,m,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(str1,str2));
//    }
//}
