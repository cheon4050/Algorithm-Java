package JadenCase_문자열_만들기;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
        System.out.println(solution("3"));
        System.out.println(solution("     a  a"));
    }
    public static String solution(String s){
        char[] arr = s.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        for (int i = 1; i < s.length() ; i++){
            if(arr[i-1] == " ".charAt(0)){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            else{
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        return new String(arr);
    }
}
