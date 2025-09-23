class Solution {
    public int solution(int[] num_list) {
        int m1 = 1;
        int m2 = 0;
        for(int i =0; i<num_list.length; i++){
            m1*=num_list[i];
            m2 += num_list[i];
            
        }
        return m1 < m2*m2 ? 1 : 0;
    }
}