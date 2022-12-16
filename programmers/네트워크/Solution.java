package 네트워크;

import java.util.*;
public class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        ArrayList<Integer>[] arr = new ArrayList[n];
        for (int i = 0; i < n; i++){
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j< n ; j++){
                if (i != j && computers[i][j] == 1){
                    arr[i].add(j);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            if (!visited[i]){
                bfs(i, arr, visited);
                result +=1;
            }

        }
        return result;
    }

    static void dfs(int v, ArrayList<Integer>[] arr, boolean[] visited){
        if (visited[v]){
            return;
        }
        visited[v] = true;
        for (int i : arr[v]){
            if (!visited[i]){
                dfs(i, arr, visited);
            }
        }
    }

    static void bfs(int v, ArrayList<Integer>[] arr, boolean[] visited){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()){
            int x = queue.poll();
            for (int i : arr[x]){
                if (!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
