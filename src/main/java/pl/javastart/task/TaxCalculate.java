package pl.javastart.task;

public class TaxCalculate {
    double taxPrice(Product product) {
        double price = switch (product.getCategory()) {
            case "Usługi" -> product.getPriceNet() * 1.23;
            case "Produkt spożywczy" -> product.getPriceNet() * 1.05;
            default -> product.getPriceNet() * 1.08;
        };
        return price;
    }
}
