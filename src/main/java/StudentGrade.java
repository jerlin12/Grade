public class StudentGrade {
    public static String grade(int marks) {
        if (marks >= 90) return "O";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }
    public static void main(String[] args) { System.out.println(grade(85)); }
}
