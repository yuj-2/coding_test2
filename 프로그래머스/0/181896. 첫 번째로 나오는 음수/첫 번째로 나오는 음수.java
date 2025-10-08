class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int num=0;
        for(int i = 0; i < len; i++){
            if(num_list[i] < 0){
                num = i;
                break;
            }
            else num = -1;
        }
        return num;
    }
}