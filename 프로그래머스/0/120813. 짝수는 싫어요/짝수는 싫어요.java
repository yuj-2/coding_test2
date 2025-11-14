class Solution {
    public int[] solution(int n) {
        int num = 0;
      int [] odd = new int[(n+1)/2];
       for(int i = 1; i<= n; i++){
           if(i%2==1){
               odd[num] = i;
               num++;
           }
       }
        return odd;
    }
}