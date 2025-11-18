public class ExamEligibility {
    public static String getExamEligibility(int attendancePercent) {
        if (attendancePercent >= 75) return "eligible";
        else return "not eligible";
    }

    public static void main(String[] args) {
        System.out.println(examEligibility(80));
        System.out.println(examEligibility(60));
    }
}
