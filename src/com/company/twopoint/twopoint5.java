//package com.company;
//
//import java.util.*;
//
///*
//5. 연속된 자연수의 합
//설명
//
//N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
//
//만약 N=15이면
//
//7+8=15
//
//4+5+6=15
//
//1+2+3+4+5=15
//
//와 같이 총 3가지의 경우가 존재한다.
//
//
//입력
//첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
//
//
//출력
//첫 줄에 총 경우수를 출력합니다.
//
//
//예시 입력 1
//15
//
//예시 출력 1
//3
//
//*/
//// 범위 잘 지정하기
//public class Main {
//
//    public int solution2(int n){
//        int answer = 0;
//        int st=1,et = 1;
//        //System.out.println("((n / 2)+1) = " + ((n / 2) + 1));
//        while (st <= (n / 2) +1 && et <= (n / 2)+1) {
//            int sum=0;
//            for (int j = st; j <=et; j++) {
//                sum += j;
//            }
//            //System.out.println("sum = " + sum +" "+et+" "+st);
//            if(sum==n){
//                answer++; et++;
//            }else if(sum<n) et++;
//            else st++;
//        }
//
//        return answer;
//    }
//
//    public int solution(int n){
//        int answer=0, cnt=1;
//        n--;
//        while(n>0){
//            cnt++;
//            n=n-cnt;
//            if(n%cnt==0) answer++;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        int n = kb.nextInt();
//
//        //ArrayList<Integer> solution = T.solution(arr1_num,arr2_num,arr1,arr2);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(n));
//    }
//}
