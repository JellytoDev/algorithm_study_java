package com.company;

import java.util.*;

/*
6. 최대 길이 연속부분수열
설명

0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.

만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면

1 1 0 0 1 1 0 1 1 0 1 1 0 1

여러분이 만들 수 있는 1이 연속된 연속부분수열은

Image1.jpg

이며 그 길이는 8입니다.


입력
첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.

두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.


출력
첫 줄에 최대 길이를 출력하세요.


예시 입력 1
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

예시 출력 1
8

*/
// 변수 모두 사용하기 (m 사용 안해서 틀렸음), 무조건 예시 고정적으로 코딩하지 말기
public class Main {

    // 14 2
    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1

    public int solution2(int n, int m, int[] arr) {

        int answer = 0;
        int st=0,et=0;

        while (st < n && et < n) {
            //System.out.println("st = " + st +" " + et);
            int change = 0;
            int sum=0;
            for (int i = st; i <=et; i++) {
                if(arr[i]==0) change++;
                sum++;
            }

            //System.out.println("sum = " + sum +" " + change+" "+answer);

            if(change>m){
                // change 원상 복귀
                while (change > m) {
                    if(arr[st]==0) change--;
                    st++;
                }
            }else{
                // max 걸러내는 부분
                if(sum > answer) answer = sum;
                et++;
            }

        }


        return answer;
    }

    public int solution(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
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

        //ArrayList<Integer> solution = T.solution(arr1_num,arr2_num,arr1,arr2);
        //for (Integer x : solution) {
        //    System.out.print(x+" ");
        //}
        System.out.println(T.solution(n,m,arr));
    }
}
