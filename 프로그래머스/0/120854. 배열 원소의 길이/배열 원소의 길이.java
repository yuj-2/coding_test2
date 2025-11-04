class Solution {
    public int[] solution(String[] strlist) {
        int n [] = new int[strlist.length];
        for(int i = 0; i < strlist.length ; i++){
            n[i] = strlist[i].length();
        }
            return n;
    }
}