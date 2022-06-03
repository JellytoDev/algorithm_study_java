//package com.company;
//
//import java.util.*;
//
//// 전화번호 목록
//public class Main {
//
//    public boolean solution(String[] phone_book) {
//
//        Arrays.sort(phone_book);
//        for (int i = 0; i < phone_book.length - 1; i++)
//            if (phone_book[i + 1].startsWith(phone_book[i]))
//                return false;
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//
//        String[] phone_book = {"119", "97674223", "1195524421"};
//
//        System.out.println(T.solution(phone_book));
//        //T.solution(n,number);
//
//    }
//
//
//}
