public class Relation {
    public static String checkRelation(int a, int b) {
        if (a < b) return "increasing";
        else if (a > b) return "decreasing";
        else return "equal";
    }

    public static void main(String[] args) {
        System.out.println(checkRelation(3, 5));
        System.out.println(checkRelation(10, 2));
        System.out.println(checkRelation(7, 7));
    }
}
