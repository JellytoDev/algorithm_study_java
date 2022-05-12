//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
///*
//9. 뮤직비디오(결정알고리즘)
//설명
//
//지니레코드에서는 불세출의 가수 조영필의 라이브 동영상을 DVD로 만들어 판매하려 한다.
//
//DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
//
//순서가 바뀌는 것을 우리의 가수 조영필씨가 매우 싫어한다. 즉, 1번 노래와 5번 노래를 같은 DVD에 녹화하기 위해서는
//
//1번과 5번 사이의 모든 노래도 같은 DVD에 녹화해야 한다. 또한 한 노래를 쪼개서 두 개의 DVD에 녹화하면 안된다.
//
//지니레코드 입장에서는 이 DVD가 팔릴 것인지 확신할 수 없기 때문에 이 사업에 낭비되는 DVD를 가급적 줄이려고 한다.
//
//고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다. 이 때 DVD의 크기(녹화 가능한 길이)를 최소로 하려고 한다.
//
//그리고 M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 꼭 같은 크기로 해야 한다.
//
//
//입력
//첫째 줄에 자연수 N(1≤N≤1,000), M(1≤M≤N)이 주어진다.
//
//다음 줄에는 조영필이 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로(자연수) 주어진다.
//
//부른 곡의 길이는 10,000분을 넘지 않는다고 가정하자.
//
//
//출력
//첫 번째 줄부터 DVD의 최소 용량 크기를 출력하세요.
//
//
//예시 입력 1
//9 3
//1 2 3 4 5 6 7 8 9
//
//예시 출력 1
//17
//
//힌트
//설명 : 3개의 DVD용량이 17분짜리이면 (1, 2, 3, 4, 5) (6, 7), (8, 9) 이렇게 3개의 DVD로 녹음을 할 수 있다.
//17분 용량보다 작은 용량으로는 3개의 DVD에 모든 영상을 녹화할 수 없다.
//    */
//// lt와 rt 사이에 답이 확실히 있다고 가정할 때 결정 알고리즘을 사용한다. (해당 범위 내에서 가능한 답이 명확히 있냐)
//// 결정 알고리즘은 이분검색을 통해 나온 값이 정답이 될 수 있는 가를 계속해서 판단한다.
////int lt=Arrays.stream(arr).max().getAsInt();
////        int rt=Arrays.stream(arr).sum(); 꼭 기억
//
//public class Main {
//
//    public int count(int[] arr, int capacity){
//        int cnt=1, sum=0;
//        for(int x : arr){
//            if(sum+x>capacity){
//                cnt++;
//                sum=x;
//            }
//            else sum+=x;
//        }
//        return cnt;
//    }
//
//    public int solution(int n, int m, int[] arr){
//        int answer=0;
//
//        int lt=Arrays.stream(arr).max().getAsInt();
//        int rt=Arrays.stream(arr).sum();
//
//        while(lt<=rt){
//            int mid=(lt+rt)/2;
//            if(count(arr, mid)<=m){
//                answer=mid;
//                rt=mid-1;
//            }
//            else lt=mid+1;
//        }
//        return answer;
//    }
//
//    //public int solution(int n, int m, int[] arr) {
//    //    int answer = 0;
//    //
//    //    // 1-9분의 배열이 주어졌을 때, db 용량이 최소 9는 되야한다. 최대는 모든 곡을 담은 1-9까지 모든 합인 45이다.
//    //    int lt = arr[n - 1] , rt = 0;
//    //    for (int i = 0; i < n; i++) rt+=arr[i];
//    //
//    //    while (lt < rt) {
//    //        int mid = (lt + rt) / 2;
//    //        int sum = 0, cnt = 0;
//    //        while (mid < sum) {
//    //            sum += arr[cnt];
//    //            cnt++;
//    //        }
//    //    }
//    //    int lt =0, rt=0,end=n-1;
//    //    return answer;
//    //}
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        //ArrayList<Integer> solution = T.solution(n,arr);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//
//        System.out.println(T.solution(n, m, arr));
//
//        //T.solution(n, pointers);
//    }
//}
