import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String r = my_string.replaceAll("[^0-9]","");
        char [] s = r.toCharArray();
        Arrays.sort(s);
        int len = s.length;
        int [] result = new int [len];
        for(int i = 0; i<len; i++){
            result[i] = s[i] - '0';
            
        }
        return result;
    }
}