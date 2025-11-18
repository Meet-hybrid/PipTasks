public class DigitToWord {
    public static String changeDigitToWord(int digit) {
        if (digit == 0) return "zero";
        else if (digit == 1) return "one";
        else if (digit == 2) return "two";
        else if (digit == 3) return "three";
        else if (digit == 4) return "four";
        else if (digit == 5) return "five";
        else if (digit == 6) return "six";
        else if (digit == 7) return "seven";
        else if (digit == 8) return "eight";
        else if (digit == 9) return "nine";
        else return "invalid";
    }

    public static void main(String[] args) {
        System.out.println(changeDigitToWord(7));
    }
}
