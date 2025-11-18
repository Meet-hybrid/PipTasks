public class IncomeClass {
    public static String incomeClass(double income) {
        if (income < 30000) return "Low";
        else if (income <= 100000) return "Middle";
        else return "High";
    }

    public static void main(String[] args) {
        System.out.println(incomeClass(20000));   
        System.out.println(incomeClass(50000));   
        System.out.println(incomeClass(150000));  
}
