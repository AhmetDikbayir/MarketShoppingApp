package marketShoppingApp;

public class Customer {
    private String name;
    private String lastName;
    private String phoneNumber;
    private double cash;
    private DiscountProperties discountProperties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public DiscountProperties getDiscountProperties() {
        return discountProperties;
    }

    public void setDiscountProperties(DiscountProperties discountProperties) {
        this.discountProperties = discountProperties;
    }

    public Customer(String name, String lastName, String phoneNumber, double cash, DiscountProperties discountProperties) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cash = cash;
        this.discountProperties = discountProperties;
    }
}
