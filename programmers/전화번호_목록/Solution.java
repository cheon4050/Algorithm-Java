package 전화번호_목록;

import java.util.*;

public class Solution {
    public boolean solution(String[] phone_book) {
        tNode root = new tNode();
        Arrays.sort(phone_book, Comparator.reverseOrder());
        for (String phoneNumber : phone_book){
            tNode now = root;
            for (int i = 0; i<phoneNumber.length(); i++){
                char c = phoneNumber.charAt(i);
                if (now.next[(int)c - 48]==null){
                    now.next[(int)c - 48] = new tNode();
                }
                now = now.next[(int)c - 48];
                if (i == phoneNumber.length()-1){
                    if (now.isEnd == true){
                        return false;
                    }
                }
                now.isEnd = true;
            }
        }
        return true;
    }

    public static class tNode {
        tNode[] next = new tNode[10];
        boolean isEnd;
    }
}
