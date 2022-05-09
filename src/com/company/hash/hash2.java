//package com.company;
//
//import java.util.*;
//
///*
//2. 아나그램(해쉬)
//설명
//
//Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
//
//예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
//
//알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
//
//길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
//
//
//입력
//첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
//
//단어의 길이는 100을 넘지 않습니다.
//
//
//출력
//두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
//
//
//예시 입력 1
//AbaAeCe
//baeeACA
//
//예시 출력 1
//YES
//
//예시 입력 2
//abaCC
//Caaab
//
//예시 출력 2
//NO
//
//*/
//// 변수 모두 사용하기 (m 사용 안해서 틀렸음), 무조건 예시 고정적으로 코딩하지 말기
//public class Main {
//
//    // 14 2
//    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1
//
//    public String solution2(String str1, String str2) {
//        String answer = "YES";
//        HashMap<Character, Integer> ch = new HashMap<>();
//        HashMap<Character, Integer> ch2 = new HashMap<>();
//
//        str1 = str1.toUpperCase();
//        str2 = str2.toUpperCase();
//
//        for (char c : str1.toCharArray()) {
//            ch.put(c, ch.getOrDefault(c, 0) + 1);
//        }
//
//        for (char c : str2.toCharArray()) {
//            ch2.put(c, ch2.getOrDefault(c, 0) + 1);
//        }
//
//        if(!ch.equals(ch2)) answer = "NO";
//
//        return answer;
//    }
//
//    public String solution(String s1, String s2){
//        String answer="YES";
//        HashMap<Character, Integer> map=new HashMap<>();
//        for(char x : s1.toCharArray()){
//            map.put(x, map.getOrDefault(x, 0)+1);
//        }
//        for(char x : s2.toCharArray()){
//            if(!map.containsKey(x) || map.get(x)==0) return "NO";
//            map.put(x, map.get(x)-1);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        String str = kb.nextLine();
//        String str2= kb.nextLine();
//
//        //ArrayList<Integer> solution = T.solution(arr1_num,arr2_num,arr1,arr2);
//        //for (Integer x : solution) {
//        //    System.out.print(x+" ");
//        //}
//        System.out.println(T.solution(str,str2));
//    }
//}
