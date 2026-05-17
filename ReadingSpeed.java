public class ReadingSpeed {
    public static String check(int wpm) {
        if (wpm < 100) return "Slow";
        else if (wpm <= 200) return "Average";
        else if (wpm <= 300) return "Fast";
        else return "Very Fast";
    }

    public static void main(String[] args) {
        System.out.println(check(250)); 
    }
}