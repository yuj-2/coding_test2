class Solution {
    public int solution(int a, int b) {
   String sa = a + "";
        String sb = b + "";
        int plus = Integer.parseInt(sa +sb);
        int mul = 2*a*b;
        if(plus > mul ) return plus;
        else if(plus == mul) return plus;
        else return mul;
    }
}