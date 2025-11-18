public class EvenOrOdd {
    public static String getEvenOrOdd(double num) {
        if (num % 1 != 0) return "invalid"; 
        int number = (int) num;
        if (number % 2 == 0) return "even";
        else return "odd";
    }

    public static void main(String[] args) {
        System.out.println(getEvenOrOdd(4));   
        System.out.println(getEvenOrOdd(7));   
        System.out.println(getEvenOrOdd(3.5));  
    }
}
