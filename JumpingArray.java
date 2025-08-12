public class JumpingArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 1, 4};
        int steps = a[0];
        for (int i = 1; i < a.length; i++) {
            if (steps == 0) { 
                System.out.println("No");
                return;
            }
            steps = Math.max(steps - 1, a[i]);
        }
        System.out.println("Yes");
    }
}
