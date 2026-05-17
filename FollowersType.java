public class FollowersType {
    public static String level(int followers) {
        if (followers >= 100000) return "Influencer";
        if (followers >= 10000) return "Micro";
        if (followers >= 1000) return "Nano";
        return "Regular";
    }

    public static void main(String[] args) {
        System.out.println(level(50000));
    }
}