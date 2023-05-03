package 귤_고르기;

import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i:tangerine){
            if (map.get(i) == null){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2)-map.get(o1));

        int result = 0;
        for (Integer key : keySet){
            k -= map.get(key);
            result += 1;
            if (k <= 0){
                break;
            }
        }

        return result;
    }
}