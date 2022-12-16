package 피로도;

import java.util.*;

public class Solution {
    public int solution(int k, int[][] dungeons) {
        int result = 0;
        ArrayList<int[][]> permutationArr = new ArrayList<>();
        permutation(dungeons, 0, dungeons.length,dungeons.length, permutationArr);
        for (int[][] arrays : permutationArr){
            int cnt = 0;
            int total = k;
//            System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arrays));
            for (int[] arr : arrays){
                if (total < arr[0]){
                    break;
                }
                total -= arr[1];
                cnt += 1;
            }
            if (cnt > result){
                result = cnt;
            }
        }
        return result;
    }

    static void permutation(int[][] arr, int depth, int n, int r, ArrayList<int[][]> result) {
        if (depth == r) {
            result.add(arr.clone());
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r, result);
            swap(arr, depth, i);
        }
    }

    static void swap(int[][] arr, int depth, int i) {
        int[] temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}
