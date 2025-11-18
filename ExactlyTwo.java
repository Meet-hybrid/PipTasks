public class ExactlyTwo {
    public static boolean checkIfExactlyTwoTrue(boolean a, boolean b, boolean c) {
        int count = 0;
        if (a) count++;
        if (b) count++;
        if (c) count++;
        return count == 2;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExactlyTwoTrue(true, true, false)); 
        System.out.println(checkIfExactlyTwoTrue(true, false, false));
    }
}
