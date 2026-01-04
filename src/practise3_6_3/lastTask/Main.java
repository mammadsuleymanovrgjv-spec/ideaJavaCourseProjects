package practise3_6_3.lastTask;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Backend Development", "H.Aliyev", 3);
        course.displayDetails();
        System.out.println("---------------------------------------------");
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", "H.Aliyev", 4, "Idtech", 6);
        onlineCourse.displayDetails();
        System.out.println("---------------------------------------------");
        if (onlineCourse.isElligibleForCertificate()) {
            System.out.println("Elligible for certificate");
        } else {
            System.out.println("Not Elligible for certificate");
        }

    }
}
