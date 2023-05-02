package 징검다리_건너기;

public class Solution {
    public int solution(int[] stones, int k) {

        int result = 0;
        int end = 200000000;
        int start = 0;

        while (start <= end){
            int mid = (start + end) / 2;
            int[] temp = new int[stones.length];
            for (int i = 0; i < stones.length; i++){
                temp[i] = stones[i] - mid + 1;
            }
            int cnt = 0;
            boolean flag = false;
            for (int i = 0; i < stones.length; i++){
                if (temp[i] <= 0){
                    cnt += 1;
                } else{
                    cnt = 0;
                }
                if (cnt == k){
                    flag = true;
                    break;
                }
            }
            if (flag){
                end = mid-1;
                continue;
            }
            result = mid;
            start = mid+1;
        }
        return result;
    }
}
