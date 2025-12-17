package generalTasksForOOP.studentGradingSystem;

public class Main {
    public static void main(String[] args) {
        Student student = new UndergraduateStudent("Jhon", 83);
        Student student2 = new GraduateStudent("Philip", 70, 15);
        System.out.println(student.getName());
        System.out.println(student.finalGrade());
        System.out.println(student2.getName());
        System.out.println(student2.finalGrade());
    }
}
