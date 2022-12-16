package 가장_큰_수;

import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i<numbers.length;i++){
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNumbers, Collections.reverseOrder());
        System.out.println("Arrays.toString(stringNumbers) = " + Arrays.toString(stringNumbers));
        String result = String.join("",stringNumbers);
        return result;
    }
}
