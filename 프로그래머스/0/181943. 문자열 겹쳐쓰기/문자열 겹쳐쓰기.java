class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        StringBuffer sb = new StringBuffer(my_string);
        int end = s + overwrite_string.length();
        
        sb.delete(s, end);
        return sb.insert(s, overwrite_string).toString();
        
    }
}