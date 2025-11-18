public class SleepCategory {
    public static String sleepCategory(int hours) {
        if (hours < 6) return "Too Little";
        else if (hours <= 8) return "Adequate";
        else return "Too Much";
    }

    public static void main(String[] args) {
        System.out.println(sleepCategory(4));
        System.out.println(sleepCategory(7)); 
        System.out.println(sleepCategory(10)); 
    }
}
