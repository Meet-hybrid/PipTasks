public class WaterIntake {
    public static String hydration(double liters) {
        if (liters < 2) return "Dehydrated";
        if (liters <= 4) return "Adequate";
        return "Overhydrated";
    }

    public static void main(String[] args) {
        System.out.println(hydration(1.5));
    }
}