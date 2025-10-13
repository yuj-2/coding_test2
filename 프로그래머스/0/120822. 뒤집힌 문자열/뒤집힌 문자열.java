class Solution {
    public String solution(String my_string) {
        
        int len = my_string.length();
        char str [] = new char[len];
        for(int i = 0; i< len; i++){
            str[i] = my_string.charAt(len-i-1);
        }
        String answer = new String(str);
        return answer;
    }
}