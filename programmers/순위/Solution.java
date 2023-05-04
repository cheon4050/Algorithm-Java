package 순위;

import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {

        int[][] arr = new int[n+1][n+1];
        int answer = 0;
        for (int[] result : results){
            arr[result[0]][result[1]] = 1;
            arr[result[1]][result[0]] = -1;
        }


        for (int k = 0 ; k <= n; k++){
            for (int i = 0 ; i <= n; i++){
                for (int j = 0 ; j <= n; j++){
                    if (arr[i][k] == 1 && arr[k][j] == 1){
                        arr[i][j] = 1;
                        arr[j][i] = -1;
                    }
                    if (arr[i][k] == -1 && arr[k][j] == -1){
                        arr[i][j] = -1;
                        arr[j][i] = 1;
                    }
                }
            }
        }
        for (int i = 1; i <= n ; i ++){
            int cnt = 0;
            System.out.println(Arrays.toString(arr[i]));
            for (int j = 1; j <= n ; j++){
                if (arr[i][j] != 0){
                    cnt += 1;
                }
            }
            if (cnt == n-1){
                answer += 1;
            }
        }

        return answer;
    }
}
