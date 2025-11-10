class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int odd=0;
        int even =0;
        for(int i = 0; i < len; i++){
            if(num_list[i]%2==1){
                odd++;
            }else even++;
        }//for
        int[] r = new int[2];
        r[0] = even;
        r[1] = odd;
        return r;
    }
}