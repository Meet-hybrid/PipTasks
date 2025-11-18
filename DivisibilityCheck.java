public class DivisibilityCheck {
    public static String divisibilityCheck(int number) {
        if (number % 3 == 0 && number % 5 == 0) return "Divisible by both";
        else if (number % 3 == 0) return "Divisible by 3";
        else if (number % 5 == 0) return "Divisible by 5";
        else return "Not divisible";
    }

    public static void main(String[] args) {
        System.out.println(divisibilityCheck(15)); 
        System.out.println(divisibilityCheck(9));  
        System.out.println(divisibilityCheck(10)); 
        System.out.println(divisibilityCheck(7));  
    }
}
