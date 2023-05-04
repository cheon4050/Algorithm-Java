package 가장_긴_팰린드롬;

import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;

        for (int i = 0; i < s.length(); i++){
            int start = i - 1;
            int end = i + 1;
            int cnt = 1;
            while (start >= 0 && end < s.length()){
                if (s.charAt(start) != s.charAt(end)){
                    break;
                }
                start -= 1;
                end += 1;
                cnt += 2;
            }
            answer = Math.max(answer, cnt);
        }
        for (int i = 0; i < s.length(); i++){
            int start = i;
            int end = i+1;
            int cnt = 0;
            while (start >= 0 && end < s.length()){
                if (s.charAt(start) != s.charAt(end)){
                    break;
                }
                start -= 1;
                end += 1;
                cnt += 2;
            }
            answer = Math.max(answer, cnt);
        }


        return answer;
    }
}