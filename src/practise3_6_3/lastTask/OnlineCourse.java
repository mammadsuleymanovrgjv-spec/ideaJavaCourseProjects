package practise3_6_3.lastTask;

public class OnlineCourse extends Course {
    private final String platform;
    private final int duration;
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration);
    }
    public boolean isElligibleForCertificate(){
        return duration>=4;
    }
}
