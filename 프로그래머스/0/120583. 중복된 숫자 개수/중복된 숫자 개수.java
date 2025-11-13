class Solution {
    public int solution(int[] array, int n) {
        int len = array.length;
        int r = 0;
        for(int i = 0; i < len; i++ ){
            if(array[i] == n) r++;
            
        }
        return r;
    }
}