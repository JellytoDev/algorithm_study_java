package com.company;

import java.util.*;

public class Main {

    public static class Job implements Comparable<Job> {
        int requestTime;
        int workingTime;

        public Job(int requestTime, int workingTime) {
            this.requestTime = requestTime;
            this.workingTime = workingTime;
        }

        @Override
        public int compareTo(Job o) {
            return this.requestTime - o.requestTime;
        }
    }

    public static int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Job> waiting = new PriorityQueue<>();
        PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o1.workingTime - o2.workingTime;
            }
        });

        for (int[] job : jobs) {
            waiting.offer(new Job(job[0], job[1]));
        }

        int cnt = 0;
        int time = 0;

        while (cnt < jobs.length) {

            while (!waiting.isEmpty() && waiting.peek().requestTime <= time) {
                pq.offer(waiting.poll());
            }

            if (!pq.isEmpty()) {
                Job tmp = pq.poll();
                time += tmp.workingTime;
                answer += (time - tmp.requestTime);
                cnt++;
            }else{
                time++;
            }
        }


        return answer / jobs.length;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};

        System.out.println(T.solution(jobs));
        //T.solution(n,number);

    }


}
