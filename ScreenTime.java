public class ScreenTime {
    public static String evaluate(int hours) {
        if (hours <= 2) return "Healthy";
        if (hours <= 4) return "Moderate";
        if (hours <= 6) return "High";
        return "Excessive";
    }

    public static void main(String[] args) {
        System.out.println(evaluate(7)); 
    }
}