public class DivisibileByTwoThree {
    public static String divisibileByTwoThree(int n) {
        if (n % 2 == 0 && n % 3 == 0) return "Divisible by 2 and 3";
        else if (n % 2 == 0) return "Divisible by 2 only";
        else if (n % 3 == 0) return "Divisible by 3 only";
        else return "Not divisible";
    }

    public static void main(String[] args) {
        System.out.println(divisibileByTwoThree(6)); 
        System.out.println(divisibileByTwoThree(8)); 
        System.out.println(divisibileByTwoThree(9));  
        System.out.println(divisibileByTwoThree(7)); 
    }
}
