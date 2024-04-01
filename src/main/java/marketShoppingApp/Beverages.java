package marketShoppingApp;

public class Beverages extends Products{

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getStock() {
        return super.getStock();
    }

    @Override
    public void setStock(double stock) {
        super.setStock(stock);
    }

    public Beverages(String name, double price, double stock) {
        super(name, price, stock);
    }
}
