package generalTasksForOOP.studentGradingSystem;

public class GraduateStudent extends Student {
    private final double bonus;

    public GraduateStudent(String name, double grade, double bonus) {
        super(name, grade);
        this.bonus = bonus;
    }

    @Override
    public double finalGrade() {
        return super.finalGrade()+bonus;
    }
}
