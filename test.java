import java.util.ArrayList;
import java.util.List;
class Product {
    private String nume;
    private Double pret;
    private int cantitatea;

    public Product(String nume, double pret, int cantitatea) {
        this.nume = nume;
        this.pret = pret;
        this.cantitatea = cantitatea;
    }

    public String getName() {
        return nume;
    }

    public void setName(String nume) {
        this.nume = nume;
    }

    public double getPrice() {
        return pret;
    }

    public void setPrice(double price) {
        this.pret = pret;
    }

    public int getQuantity() {
        return cantitatea;
    }

    public void setQuantity(int cantitatea) {
        this.cantitatea = cantitatea;
    }
}
class Book extends Product {
    private String autor;
    private String gen;

    public Book(String name, double price, int quantity, String autor, String gen) {
        super(name, price, quantity);
        this.autor = autor;
        this.gen = gen;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGen() {
        return gen;
    }

    public void setGenre(String gen) {
        this.gen = gen;
    }
}
class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, int quantity, String brand, String model) {
        super(name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
class ShoppingCart {
    private List<Product> products;
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

}
public class Main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Book book = new Book("Micul Prinț", 100, 1, "A. de Sent Exupery", "fantastic");

        Electronics electronics = new Electronics("Blender", 300, 3, "Sony", "XC551");

        cart.addProduct(book);
        cart.addProduct(electronics);

        double totalPrice = cart.calculateTotalPrice();

        System.out.println("Total Price: MDL " + totalPrice);

    }
}
