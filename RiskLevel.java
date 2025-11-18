public class RiskLevel {
    public static String riskLevel(int value) {
        if (value >= 0 && value <= 30) return "Low Risk";
        else if (value <= 70) return "Medium Risk";
        else if (value <= 100) return "High Risk";
        else return "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(riskLevel(20)); 
        System.out.println(riskLevel(50)); 
        System.out.println(riskLevel(90));  
        System.out.println(riskLevel(150)); 
    }
}
