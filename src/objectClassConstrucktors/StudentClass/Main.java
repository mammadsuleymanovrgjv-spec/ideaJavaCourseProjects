package objectClassConstrucktors.StudentClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jhon", 22);
        Student student2 = new Student("Alex", 25);
        student.displayInfo();
        student2.displayInfo();
    }
}
