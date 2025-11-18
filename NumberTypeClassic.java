public class NumberTypeClassic {
    public static String checkNumberTypeClassic(int num) {
        if (num > 0) return "positive";
        else if (num < 0) return "negative";
        else return "zero";
    }

    public static void main(String[] args) {
        System.out.println(numberTypeClassic(5));
        System.out.println(numberTypeClassic(-3));
        System.out.println(numberTypeClassic(0));
    }
}
