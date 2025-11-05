class Solution {
    public int[] solution(int money) {
        int [] n = new int[2];
        n[0] = money/5500;
        n[1] = money- money/5500 * 5500;
        return n;    
    }
    
}