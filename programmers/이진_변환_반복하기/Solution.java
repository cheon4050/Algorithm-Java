package 이진_변환_반복하기;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("110010101001"));
        System.out.println(solution("01110"));
        System.out.println(solution("1111111"));
    }
    public static int[] solution(String s) {
        int[] answer = {0, 0};
        while (!s.equals("1")){
            String temp = toBinary(s, answer);
            System.out.println("temp = " + temp);
            System.out.println("s = " + s);
            s = temp;
        }
        return answer;
    }

    private static String toBinary(String s, int[] answer){
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                temp += "1";
            }
            else{
                answer[1] += 1;
            }
        }
        String binaryString = Integer.toBinaryString(temp.length());
        answer[0] += 1;
        return binaryString;
    }
}
