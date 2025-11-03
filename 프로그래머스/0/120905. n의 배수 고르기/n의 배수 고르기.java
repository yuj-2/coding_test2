class Solution {
    public int[] solution(int n, int[] numlist) {
        int len = numlist.length;
        int num = 0;
        for (int i = 0; i < len; i++ ){
            if(numlist[i]%n == 0) {
                num +=1;
            }
        }
        int result[] = new int[num];
        int j = 0;
        for(int i = 0; i<len; i++){
            if(numlist[i]%n == 0){
                result[j] = numlist[i];
                j+=1;
            }
        }
        return result;
        
    }
}