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
//    //     3   4  4      3      2       1   1    1
//    //((( () ( () () )) ( () ) () )) ( () () )
//    public int solution(String str){
//        int answer = 0;
//        Stack<Character> stack = new Stack<>();
//
//        int i =0;
//        for (char c : str.toCharArray()) {
//            if (c == ')') {
//                stack.pop()
//                if (str.charAt(i-1)== '(') {
//                    answer+=stack.size();
//                }else{
//                    answer+=1;
//                }
//            }else if(c=='('){
//                stack.push('(');
//            }
//            i++;
//        }
//
//        return answer;
//    }
//
//    public int solution2(String str){
//        int cnt=0;
//        Stack<Character> stack=new Stack<>();
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)=='(') stack.push('(');
//            else{
//                stack.pop();
//                if(str.charAt(i-1)=='(') cnt+=stack.size();
//                else cnt++;
//            }
//        }
//        return cnt;
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
