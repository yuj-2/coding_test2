class Solution {
    public String solution(String my_string, int n) {
        int len = my_string.length();
        my_string =my_string.substring(len-n);
        return my_string;
    }
}