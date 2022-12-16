package 가장_먼_노드;

import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<Edge>[] graph = new ArrayList[n+1];
        PriorityQueue<Edge> q = new PriorityQueue<Edge>();
        int[] distance = new int[n+1];
        boolean[] visited = new boolean[n+1];
        for (int i = 1;i <= n; i++){
            graph[i] = new ArrayList<Edge>();
        }
        for (int[] e : edge){
            graph[e[0]].add(new Edge(e[1], 1));
            graph[e[1]].add(new Edge(e[0], 1));
        }

        q.add(new Edge(1,0));
        
        distance[1] = 0;
        while(!q.isEmpty()){
            Edge v = q.poll();
            
            if (visited[v.idx])
                continue;
            visited[v.idx] = true;
            for (int i = 0; i < graph[v.idx].size(); i++){
                Edge tmp = graph[v.idx].get(i);
                int next = tmp.idx;
                int cost = tmp.cost;
                if (distance[next] > distance[v.idx] + cost){
                    distance[next] = cost + distance[v.idx];
                    q.add(new Edge(next, distance[next]));
                }
            }
        }

        System.out.println("Arrays.toString(distance) = " + Arrays.toString(distance));
        int answer = 0;
        return answer;
    }

    static class Edge implements Comparable<Edge>{
        int idx;
        int cost;

        Edge(int idx, int cost){
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            if (this.cost > o.cost) return 1;
            return -1;
        }
    }
}