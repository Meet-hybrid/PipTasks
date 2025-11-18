public class TemperatureLevel {
    public static String checkTemperatureLevel(int temp) {
        if (temp < 0) return "Freezing";
        else if (temp <= 15) return "Cold";
        else if (temp <= 25) return "Warm";
        else return "Hot";
    }

    public static void main(String[] args) {
        System.out.println(checkTemperatureLevel(-5));
        System.out.println(checkTemperatureLevel(10));
        System.out.println(checkTemperatureLevel(20));
        System.out.println(checkTemperatureLevel(30));
    }
}
