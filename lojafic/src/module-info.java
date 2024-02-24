import java.util.ArrayList;
import java.util.List;

// Classe que representa um produto
class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    
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

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}

// Classe que representa um cliente
class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Classe que representa um item no carrinho de compras
class ShoppingCartItem {
    private Product product;
    private int quantity;

    public ShoppingCartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters e Setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Classe que representa o carrinho de compras
class ShoppingCart {
    private List<ShoppingCartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Adicionar um item ao carrinho
    public void addItem(Product product, int quantity) {
        items.add(new ShoppingCartItem(product, quantity));
    }

    // Calcular o total do carrinho
    public double calculateTotal() {
        double total = 0;
        for (ShoppingCartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando alguns produtos
        Product laptop = new Product("Laptop", 1500.0, 10);
        Product smartphone = new Product("Smartphone", 800.0, 20);

        // Criando um cliente
        Customer customer = new Customer("Alice", "123 Main St");

        // Criando um carrinho de compras para o cliente
        ShoppingCart cart = new ShoppingCart();

        // Adicionando itens ao carrinho
        cart.addItem(laptop, 2);
        cart.addItem(smartphone, 1);

        // Calculando o total do carrinho
        double total = cart.calculateTotal();
        System.out.println("Total da compra: $" + total);
    }
}
