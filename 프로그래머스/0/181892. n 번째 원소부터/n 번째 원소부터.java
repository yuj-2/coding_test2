class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length - n + 1;
        int[] num = new int[len];
        for(int i = 0; i < len;i++){
            num[i] = num_list[n+i-1];
        }
        return num;
    }
}