public class ItemCategory {
    public static String itemCategory(int items) {
        if (items >= 50) return "Bulk";
        else if (items >= 10) return "Standard";
        else if (items == 1) return "Single";
        else return "Few";
    }

    public static void main(String[] args) {
        System.out.println(itemCategory(1));  
        System.out.println(itemCategory(5));  
        System.out.println(itemCategory(20)); 
        System.out.println(itemCategory(100)); 
    }
}
