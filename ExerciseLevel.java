public class ExerciseLevel {
    public static String exerciseLevel(int days) {
        if (days <= 0) return "Inactive";
        else if (days <= 2) return "Light";
        else if (days <= 4) return "Moderate";
        else return "Active";
    }

    public static void main(String[] args) {
        System.out.println(exerciseLevel(0)); 
        System.out.println(exerciseLevel(2)); 
        System.out.println(exerciseLevel(3)); 
        System.out.println(exerciseLevel(5)); 
    }
}
