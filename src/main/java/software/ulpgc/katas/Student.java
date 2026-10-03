package software.ulpgc.katas;

public record Student(String name, double firstGrade, double secondGrade) {
    public double averageGrade() {
        return (firstGrade + secondGrade) / 2;
    }
    public boolean isApproved() {
        return averageGrade() >= 5;
    }
}
