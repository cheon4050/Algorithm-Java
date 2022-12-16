package 더_맵게;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : scoville){
            minHeap.add(num);
        }
        int cnt = 0;
        while(minHeap.peek() < K && minHeap.size() != 1){
            int num1 = minHeap.poll();
            int num2 = minHeap.poll();
            int result = num1 + num2*2;
            minHeap.add(result);
            cnt += 1;
        }
        if (minHeap.peek() < K){
            return -1;
        }
        else{
            return cnt;
        }
    }
}