class Solution {
    public int solution(int[] array, int height) {
        int len = array.length;
        int n = 0;
        for(int i = 0; i < len; i++){
            if(array[i] > height){
                n += 1;
            }
        }
        return n;
    }
}