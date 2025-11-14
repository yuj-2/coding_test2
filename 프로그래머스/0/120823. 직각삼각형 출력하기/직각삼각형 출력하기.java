import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String r = "*";
        for(int i=1; i<=n; i++){
            System.out.println(r.repeat(i));
        }
        
    }
}