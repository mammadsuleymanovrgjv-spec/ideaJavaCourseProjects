package objectClassConstrucktors.EmployeeClass;

public class Adress {
    private String street;
    private String city;
    private int zipCode;
    public Adress(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public void adressDetails() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}
