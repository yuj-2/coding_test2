class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len = num2-num1 +1;
        int n[] = new int [len];
        for(int i = 0; i < len; i++ ){
            n[i] = numbers[num1+i];
            
        }
        return n;
    }
}