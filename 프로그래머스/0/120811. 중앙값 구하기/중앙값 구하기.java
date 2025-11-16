class Solution {
    public int solution(int[] array) {
        int temp = 0;
        int len = array.length;
        
        for(int j = 0; j<len-1; j++){
            for(int i = 0; i < len-1-j; i++){
            if(array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1]=temp;
            }
            
        }    
        }
        return array[len/2];
        
    }
}