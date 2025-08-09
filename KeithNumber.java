import java.util.*;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        List<Integer> digits = new ArrayList<>();
        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }
        int sum;
        while (true) {
            sum = 0;
            for (int d : digits) sum += d;
            if (sum == num) {
                System.out.println(num + " is a Keith Number.");
                break;
            } else if (sum > num) {
                System.out.println(num + " is NOT a Keith Number.");
                break;
            }
            digits.remove(0);
            digits.add(sum);
        }
    }
}
