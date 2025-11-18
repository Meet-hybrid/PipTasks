public class Largest {
    public static int findLargest(int one, int two, int three) {
        int max = one;
        if (two > max) max = two;
        if (three > max) max = three;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(10, 25, 7));
    }
}
