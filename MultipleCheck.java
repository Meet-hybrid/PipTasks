public class MultipleCheck {
    public static String checkNumber(int n) {
        boolean m7 = n % 7 == 0;
        boolean m11 = n % 11 == 0;

        if (m7 && m11) return "Both";
        if (m7) return "Multiple of 7";
        if (m11) return "Multiple of 11";
        return "Neither";
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(77));
    }
}