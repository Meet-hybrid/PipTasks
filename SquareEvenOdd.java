
public class SquareEvenOdd {
    public static String squareEvenOdd(int n) {
        int root = (int) Math.sqrt(n);
        boolean isSquare = (root * root == n);
        boolean isEven = (n % 2 == 0);

        if (isSquare && isEven) return "Perfect Square and Even";
        if (isSquare) return "Perfect Square and Odd";
        if (isEven) return "Not Perfect Square and Even";
        return "Not Perfect Square and Odd";
    }

    public static void main(String[] args) {
        System.out.println(squareEvenOdd(16));
        System.out.println(squareEvenOdd(9)); 
        System.out.println(squareEvenOdd(8)); 
        System.out.println(squareEvenOdd(7));  
    }
}
