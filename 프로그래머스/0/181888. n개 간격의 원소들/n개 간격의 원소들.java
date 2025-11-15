class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int len = num_list.length;
        int a = len/n;
        if(len%n>0) a+=1;
        
        int[] result = new int [a];
        int b = 0;
        for(int i = 0; i<len; i+=n){
            result[b] = num_list[i];
            b++;
        }
        
        return result;
    }
}