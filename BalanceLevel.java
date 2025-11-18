public class BalanceLevel {
    public static String balanceLevel(double balance) {
        if (balance < 100) return "Low";
        else if (balance <= 1000) return "Medium";
        else return "High";
    }

    public static void main(String[] args) {
        System.out.println(balanceLevel(50));  
        System.out.println(balanceLevel(500));  
        System.out.println(balanceLevel(2000)); 
    }
}
