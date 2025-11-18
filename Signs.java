public class Signs {
    public static String getSumSign(int a, int b) {
        int sum = a + b;
        if (sum > 0) return "positive";
        else if (sum < 0) return "negative";
        else return "zero";
    }

    public static void main(String[] args) {
        System.out.println(getSumSign(5, -3));
    }
}
