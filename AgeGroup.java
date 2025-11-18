public class AgeGroup {
    public static String getAgeGroup(int age) {
        if (age >= 0 && age <= 12) return "child";
        else if (age >= 13 && age <= 19) return "teen";
        else if (age >= 20 && age <= 59) return "adult";
        else if (age >= 60) return "senior";
        else return "invalid";
    }

    public static void main(String[] args) {
        System.out.println(getAgeGroup(29));
    }
}
