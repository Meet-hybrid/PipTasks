public class AgeDetail {
    public static String ageDetail(int age) {
        if (age < 0) return "Invalid";
        else if (age <= 1) return "Infant";
        else if (age <= 4) return "Toddler";
        else if (age <= 12) return "Child";
        else if (age <= 17) return "Teen";
        else if (age <= 59) return "Adult";
        else return "Senior";
    }

    public static void main(String[] args) {
        System.out.println(ageDetail(-2));
        System.out.println(ageDetail(1));  
        System.out.println(ageDetail(3));  
        System.out.println(ageDetail(10)); 
        System.out.println(ageDetail(16));         System.out.println(ageDetail(40)); 
        System.out.println(ageDetail(70)); 
    }
}
