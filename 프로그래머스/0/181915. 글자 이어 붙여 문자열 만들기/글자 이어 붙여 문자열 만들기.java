class Solution {
    public String solution(String my_string, int[] index_list) {
        int len = index_list.length;
        String r = "";
        for(int i = 0; i < len; i++){
            r += my_string.substring(index_list[i],index_list[i]+1);
        }
        return r;
    }
}