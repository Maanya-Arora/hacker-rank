import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(sumMultiples(n));
        }
    }

    private static long sumMultiples(int n) {
        n--;
        long sum = sumDivisibleBy(n, 3) + sumDivisibleBy(n, 5) - sumDivisibleBy(n, 15);
        return sum;
    }

    private static long sumDivisibleBy(int n, int x) {//long accounts for all test cases
        long p = n / x;
        return x * (p * (p + 1)) / 2;//arithmetic progression formula
    }
}
