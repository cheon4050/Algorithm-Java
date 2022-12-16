package 입국_심사;


class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        long end = Long.MAX_VALUE;

        while(start <= end){
            long cnt = 0;
            long mid = (start + end)/2;
            for (long time : times){
                cnt += mid / time;
            }
            if (cnt < n){
                start = mid+1;
            }
            else if(cnt <= n){
                if (cnt <= n && answer > mid){
                    answer = mid;
                }
                end = mid-1;
            }
        }
        return answer;
    }
}