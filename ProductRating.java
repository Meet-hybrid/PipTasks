public class ProductRating {
    public static String productRating(int rating) {
        if (rating == 5) return "Excellent";
        if (rating == 4) return "Good";
        if (rating == 3) return "Average";
        if (rating == 2) return "Poor";
        return "Terrible";
    }

    public static void main(String[] args) {
        System.out.println(productRating(5));
    }
}