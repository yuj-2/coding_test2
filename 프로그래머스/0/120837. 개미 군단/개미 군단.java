class Solution {
    public int solution(int hp) {
        int a = hp/5;
        hp = hp%5;
        
        a += hp/3;
        hp = hp%3;
        
        a+= hp/1;
        
        return a;
    }
}