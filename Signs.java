public class Sign {
    public static String signRelation(int a, int b) {
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) return "Same Sign";
        if (a == 0 || b == 0) return "One is Zero";
        else return "Opposite Signs";
    }

    public static void main(String[] args) {
        System.out.println(signRelation(5, 3));  
        System.out.println(signRelation(-4, -2)); 
        System.out.println(signRelation(0, 7));   
        System.out.println(signRelation(6, -3));  
    }
}
