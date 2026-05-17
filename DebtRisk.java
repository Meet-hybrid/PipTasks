public class DebtRisk {
    public static String risk(double dti) {
        if (dti < 20) return "Low Risk";
        if (dti <= 35) return "Medium Risk";
        return "High Risk";
    }

    public static void main(String[] args) {
        System.out.println(risk(40)); 
    }
}