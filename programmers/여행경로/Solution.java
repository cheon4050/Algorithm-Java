package 여행경로;

import java.util.*;
class Solution {

    boolean[] visited;
    ArrayList<String> result;


    public String[] solution(String[][] tickets) {

        visited = new boolean[tickets.length];
        result = new ArrayList<>();

        dfs("ICN", "ICN", 0, tickets);

        Collections.sort(result);

        String[] answer = result.get(0).split(" ");
        return answer;
    }

    private void dfs(String v, String route, int cnt, String[][] tickets){
        if (cnt == visited.length){
            result.add(route);
            return;
        }
        for(int i = 0; i < visited.length ; i++){
            if (!visited[i] && tickets[i][0].equals(v)){
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], cnt+1, tickets);
                visited[i] = false;
            }
        }
    }
}