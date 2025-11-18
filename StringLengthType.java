public class StringLengthType {
    public static String getStringLengthType(String text) {
        int len = text.length();
        if (len < 5) return "short";
        else if (len <= 10) return "medium";
        else return "long";
    }

    public static void main(String[] args) {
        System.out.println(getStringLengthType("I'm"));
        System.out.println(getStringLengthType("inlove"));
        System.out.println(getStringLengthType("withProgramming"));
    }
}
