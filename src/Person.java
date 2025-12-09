public class Person {
    private String name;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void personInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Height: " + person.getHeight() + " cm");
    }
}
