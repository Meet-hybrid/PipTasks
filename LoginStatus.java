public class LoginStatus {
    public static String loginStatus(int attempts) {
        if (attempts >= 3) return "Locked";
        else if (attempts == 2) return "Warning";
        else return "Allowed";
    }

    public static void main(String[] args) {
        System.out.println(loginStatus(0));
        System.out.println(loginStatus(2)); 
        System.out.println(loginStatus(3)); 
    }
}
