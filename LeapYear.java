public class LeapYear {
    public static boolean isALeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1996));
        System.out.println(isLeapYear(2025));
    }
}
