public class JobLevel {
    public static String jobLevel(String role, int years) {
        if (years < 3) return "Junior";
        else if (years <= 6) return "Mid-Level";
        else return "Senior";
    }

    public static void main(String[] args) {
        System.out.println(jobLevel("Developer", 2)); 
        System.out.println(jobLevel("Designer", 5));  
        System.out.println(jobLevel("Manager", 10)); 
    }
}
