package taskExceptions.throwVsThrows;

public class Main {
    public static void riskyMethod() throws Exception {
        throw new Exception("Here can be exception");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Exception cathced! " + e.getMessage());
        }

    }
}
