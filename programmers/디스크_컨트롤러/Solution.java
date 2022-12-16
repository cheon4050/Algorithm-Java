package 디스크_컨트롤러;

import java.util.*;
public class Solution {
    public int solution(int[][] jobs) {
        PriorityQueue<int[]> h = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        Arrays.sort(jobs, (o1, o2) -> {
            if (o1[0] == o2[0]){
                return o1[1] - o2[1];
            }
            else{
                return o1[0] - o2[0];
            }
        });
        Queue<int[]> queue = new LinkedList<>(Arrays.asList(jobs));
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < jobs.length ; i++){
            int num = queue.size();
            for (int j = 0; j < num ; j++){
                if (queue.peek()[0] <= cnt){
                    int[] job = queue.poll();
                    h.add(job);
                }
                else{
                    break;
                }
            }
            if (h.isEmpty()){
                int[] job = queue.poll();
                sum += job[1];
                cnt = job[0] + job[1];
            }
            else{
                int job[] = h.poll();
                sum += cnt - job[0] + job[1];
                cnt += job[1];
            }
        }

        return (int)(sum / jobs.length);
    }
}
