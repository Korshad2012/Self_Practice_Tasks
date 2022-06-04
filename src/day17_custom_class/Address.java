package day17_custom_class;

public class Address {

    public String buildingNumber;
    public String street;
    public String city;
    public String zipCode;

    public void setInfo(String buildingNumber, String street, String city, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
