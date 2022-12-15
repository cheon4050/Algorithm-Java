package 완주하지_못한_선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String result = "";
        for (int i = 0; i < participant.length; i++){
           if (hashMap.get(participant[i]) == null){
               hashMap.put(participant[i], 1);
           }
           else{
               hashMap.put(participant[i], hashMap.get(participant[i])+1);
           }
        }
        for (int i = 0; i < completion.length; i++){
            hashMap.put(completion[i],hashMap.get(completion[i])-1);
        }

        for (int i = 0; i < participant.length; i++){
            if (hashMap.get(participant[i]) != 0){
                result = participant[i];
                break;
            }
        }
        return result;
    }
}