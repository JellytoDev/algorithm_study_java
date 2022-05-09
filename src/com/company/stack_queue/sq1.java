//package com.company;
//
//import java.util.*;
//
///*
//1. 올바른 괄호
//설명
//
//괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//
//(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
//
//
//입력
//첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
//
//
//출력
//첫 번째 줄에 YES, NO를 출력한다.
//
//
//예시 입력 1
//(()(()))(()
//
//예시 출력 1
//NO
//*/
////
//public class Main {
//    // 틀린 답
//    //public String solution(String str){
//    //    String answer= "YES";
//    //    Stack<Character> stack = new Stack<>();
//    //
//    //    for (char c : str.toCharArray()) {
//    //        if (c == ')') {
//    //            if (stack.peek() == '(') {
//    //                stack.pop();
//    //            }else{
//    //                return "NO";
//    //            }
//    //        }else{
//    //            stack.push(c);
//    //        }
//    //    }
//    //
//    //    if(!stack.isEmpty()){
//    //        return "NO";
//    //    }
//    //
//    //    return answer;
//    //}
//
//    public String solution(String str){
//        String answer="YES";
//        Stack<Character> stack=new Stack<>();
//        for(char x : str.toCharArray()){
//            if(x=='(') stack.push(x);
//            else{
//                if(stack.isEmpty()) return "NO";
//                stack.pop();
//            }
//        }
//        if(!stack.isEmpty()) return "NO";
//        return answer;
//    }
//
//
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        String str = kb.nextLine();
//
//        //ArrayList<Integer> solution = T.solution(n,m,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(str));
//    }
//}
