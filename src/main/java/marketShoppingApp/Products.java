package marketShoppingApp;

public abstract class Products {
    private String name;
    private double price;
    private double stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Products(String name, double price, double stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
