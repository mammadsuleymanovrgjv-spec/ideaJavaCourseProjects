package taskExceptions.singleCatchBlock;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) //Single catch block
        {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
