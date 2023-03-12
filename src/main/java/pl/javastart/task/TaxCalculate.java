package pl.javastart.task;

public class TaxCalculate {
    private double tax23 = 0.23;
    private double tax8 = 0.08;
    private double tax5 = 0.05;

    double taxPrice(Product product) {
        double price = switch (product.getCategory()) {
            case "Usługi" -> product.getPriceNet() * (1 + tax23);
            case "Produkt spożywczy" -> product.getPriceNet() * (1 + tax5);
            default -> product.getPriceNet() * (1 + tax8);
        };
        return price;
    }
}
