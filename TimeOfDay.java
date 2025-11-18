public class TimeOfDay {
    public static String timeOfDay(int hour) {
        if (hour < 0 || hour > 23) return "Invalid";
        if (hour < 12) return "Morning";
        else if (hour < 17) return "Afternoon";
        else if (hour < 21) return "Evening";
        else return "Night";
    }

    public static void main(String[] args) {
        System.out.println(timeOfDay(9));  
        System.out.println(timeOfDay(14));
        System.out.println(timeOfDay(19)); 
        System.out.println(timeOfDay(22));  
        System.out.println(timeOfDay(25));  
    }
}
