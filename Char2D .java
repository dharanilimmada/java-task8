public class Char2D {
    public static void main(String[] args) {
        String[][] array = {
            {"Hello1237", "Dharani@123456"},
            {"Java#412", "52R#"},
            {"542R78", "12354@#!$%"}
        };

        int vowelCount = 0;
        int consonantCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;

        for (String[] row : array) {
            for (String element : row) {
                for (char ch : element.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        char lower = Character.toLowerCase(ch);
                        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    } else if (Character.isDigit(ch)) {
                        numberCount++;
                    } else {
                        specialCharCount++;
                    }
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
}
