package 멀리_뛰기;

import java.util.*;
class Solution {
    public long solution(int n) {
        long[] a = new long[n+1];
        if (n == 1){
            return 1;
        }
        a[1] = 1;
        a[2] = 2;

        for (int i = 3; i <= n; i++){
            a[i] += (a[i-1] + a[i-2]) % 1234567;
        }

        return a[n];
    }
}