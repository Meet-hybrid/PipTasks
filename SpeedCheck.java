public class SpeedCheck {
    public static String speedCheck(int speed) {
        if (speed <= 60) return "Normal";
        else if (speed <= 100) return "Fast";
        else return "Speeding";
    }

    public static void main(String[] args) {
        System.out.println(speedCheck(50));  
        System.out.println(speedCheck(80));  
        System.out.println(speedCheck(120));  
    }
}
