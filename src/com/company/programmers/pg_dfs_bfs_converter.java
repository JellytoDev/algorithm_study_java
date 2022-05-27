//package com.company;
//
//import java.util.*;
//
//public class Main {
//
//    public static Map<String,Boolean> visited = new HashMap<>();
//
//    public int solution(String begin, String target, String[] words) {
//        int answer = 0;
//
//        for (int i = 0; i < words.length; i++) {
//            visited.put(words[i], false);
//        }
//
//        // targetn 과 같은지 검증
//        answer = bfs(begin, target, words);
//
//        System.out.println("answer = " + answer);
//        return answer;
//    }
//
//    public static class StrNode{
//        public String str;
//        public int cnt;
//
//        public StrNode(String str, int cnt) {
//            this.str = str;
//            this.cnt = cnt;
//        }
//    }
//
//    public int bfs(String start,String target,String[] words) {
//        Queue<StrNode> q = new LinkedList<>();
//
//        q.offer(new StrNode(start,0));
//
//        while (!q.isEmpty()) {
//            StrNode tmp = q.poll();
//
//            if(tmp.str.equals(target)){
//                //answer = tmp.cnt;
//                return tmp.cnt;
//            }
//
//            for (int i = 0; i < words.length; i++) {
//
//                if(visited.get(words[i]) == true) continue;
//
//                char[] tmpChars = tmp.str.toCharArray();
//                char[] wordChars = words[i].toCharArray();
//
//                if(tmpChars.length != wordChars.length) continue;
//
//                int localCnt = 0;
//                for (int j = 0; j < tmpChars.length; j++) {
//                    if(tmpChars[j] == wordChars[j]) localCnt++;
//                }
//
//                if (localCnt == tmpChars.length - 1) {
//                    //System.out.println("words[i] = " + words[i]);
//                    q.offer(new StrNode(words[i],tmp.cnt+1));
//                    visited.put(words[i], true);
//                }
//            }
//        }
//
//        return 0;
//
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String begin = "hit";
//        String target = "cog";
//        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
//        String[] words2 = {"hot", "dot", "dog", "lot", "log"};
//
//        T.solution(begin,target,words);
//
//    }
//
//
//}
