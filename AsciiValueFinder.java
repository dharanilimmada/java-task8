public class AsciiValueFinder {
    public static void main(String[] args) {
        String input = "Dharani";

        System.out.println("Character\tASCII Value");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            System.out.println("   " + ch + "\t\t   " + ascii);
        }
    }
}
