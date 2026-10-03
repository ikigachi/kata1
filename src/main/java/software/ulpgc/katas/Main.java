package software.ulpgc.katas;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Lucas", 7.5, 6.0);

        System.out.println("Student: " + student.name());
        System.out.println("Average grade: " + student.averageGrade());
        System.out.println("Approved: " + student.isApproved());
    }
}