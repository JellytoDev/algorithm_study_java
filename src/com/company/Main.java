package com.company;

import java.util.*;

/*
1. 올바른 괄호
설명

괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.


출력
첫 번째 줄에 YES, NO를 출력한다.


예시 입력 1
(()(()))(()

예시 출력 1
NO
*/
//
public class Main {

    public int solution(int n,int m,int[] arr){
        int answer=-1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n; k++) {
                    set.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int cnt = 1;
        for (Integer x : set) {
            //System.out.println("x = " + x);
            if(cnt == m) return x;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //ArrayList<Integer> solution = T.solution(n,m,arr);
        //for (Integer x : solution) {
        //    System.out.print(x+" ");
        //}
        System.out.println(T.solution(n,m,arr));
    }
}
