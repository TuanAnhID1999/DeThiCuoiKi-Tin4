public class Bike {
    private String name;
    private String brand;
    private double  price = 0;
    private int quantily = 0;

    public Bike(String name, String brand, double price, int quantily) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantily = quantily;
    }

    public Bike(String name, String brand) {
        this.name=name;
        this.brand=brand;
        this.price=0;
        this.quantily=0;

    }

    public Bike(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + ", quality=" + quantily + "]";
    }

}
