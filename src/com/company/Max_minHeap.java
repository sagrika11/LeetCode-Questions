package com.company;
import java.util.*;
public class Max_minHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//Max heap
       // PriorityQueue<Integer> pq = new PriorityQueue<>();//Min heap
        pq.add(67);
        pq.add(1);
        pq.add(89);
        pq.add(0);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }
}
