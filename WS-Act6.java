import java.util.*;

class ProductProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 45000));
        products.add(new Product("Smartphone", 28000));
        products.add(new Product("Headphones", 1500));
        products.add(new Product("Backpack", 900));
        products.add(new Product("USB Flash Drive 64GB", 600));
        products.add(new Product("Keyboard", 750));
        products.add(new Product("Monitor 24-inch", 6500));

        System.out.print("Enter minimum price to filter: ");
        double minPrice = sc.nextDouble();

        long count = products.stream()
                .filter(p -> p.getPrice() > minPrice)
                .count();

        System.out.println("Number of expensive products: " + count);

        sc.close();
    }
}

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}
