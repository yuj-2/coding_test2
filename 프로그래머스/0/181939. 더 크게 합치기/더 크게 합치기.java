class Solution {
    public int solution(int a, int b) {
        String as = a + "";
        String bs = b + "";
        String ab = as + bs;
        String ba = bs+as;
        int abn = Integer.parseInt(ab);
        int ban = Integer.parseInt(ba);
        
        if(abn > ban) return abn;
        else return ban;
    }
}