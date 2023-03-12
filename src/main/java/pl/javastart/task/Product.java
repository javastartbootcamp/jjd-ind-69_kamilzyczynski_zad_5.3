package pl.javastart.task;

public class Product {
    private String name;
    private String description;
    private double priceNet;
    private String category;

    public Product(String name, String description, double priceNet, String category) {
        this.name = name;
        this.description = description;
        this.priceNet = priceNet;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceNet() {
        return priceNet;
    }

    public String getCategory() {
        return category;
    }
}
