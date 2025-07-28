✅ 1. Java Program to Find the Total Number of Even Indexed Values

public class EvenIndexedValues {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        int count = 0;
        for (int i = 0; i < arr.length; i += 2) {
            count++;
        }
        System.out.println("Total even-indexed values: " + count);
    }
}
✅ 2. Java Program to Find the Total Number of Even and Odd Numbers in a String

public class EvenOddCountInString {
    public static void main(String[] args) {
        String s = "a3b6c9d2e5";
        int even = 0, odd = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                if (num % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
✅ 3. Sruthi Likes Reading Books And Playing Games (Print Odd Index Words)

public class OddIndexWords {
    public static void main(String[] args) {
        String str = "Sruthi Likes Reading Books And Playing Games";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                System.out.println(words[i]);
            }
        }
    }
}
✅ 4. Java Program to Find ASCII Code of Each and Every Character in a String

public class ASCIICodes {
    public static void main(String[] args) {
        String s = "Java123";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + " = " + ascii);
        }
    }
}
