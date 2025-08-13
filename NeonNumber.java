public class NeonNumber {
    static boolean isNeon(int n) {
        long sq = (long) n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 9;
        System.out.println(isNeon(n));
    }
}
