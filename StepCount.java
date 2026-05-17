public class StepCount {
    public static String check(int steps) {
        if (steps < 5000) return "Sedentary";
        else if (steps < 7500) return "Lightly Active";
        else if (steps < 10000) return "Active";
        else return "Very Active";
    }

    public static void main(String[] args) {
        System.out.println(check(8200)); 
    }
}