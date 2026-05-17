public class CaffeineIntake {
    public static String check(int mg) {
        if (mg < 100) return "Low";
        else if (mg <= 200) return "Moderate";
        else if (mg <= 400) return "High";
        else return "Excessive";
    }

    public static void main(String[] args) {
        System.out.println(check(250)); // High
    }
}