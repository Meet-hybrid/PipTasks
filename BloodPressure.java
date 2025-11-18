public class BloodPressure {
    public static String bloodPressure(int systolic, int diastolic) {
        if (systolic > 180 || diastolic > 120) return "Crisis";
        if (systolic >= 140 || diastolic >= 90) return "High";
        if (systolic >= 120 && systolic < 130 && diastolic < 80) return "Elevated";
        return "Normal";
    }

    public static void main(String[] args) {
        System.out.println(bloodPressure(190, 100));
        System.out.println(bloodPressure(150, 95));  
        System.out.println(bloodPressure(125, 75));  
        System.out.println(bloodPressure(110, 70));  
    }
}
