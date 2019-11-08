package techSpec;

public class Grade implements TechSpec{
    private String grade;

    public Grade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
