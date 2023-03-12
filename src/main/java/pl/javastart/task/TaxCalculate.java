package pl.javastart.task;

public class TaxCalculate {
    private static final double TAX_23 = 0.23;
    private static final double TAX_8 = 0.08;
    private static final double TAX_5 = 0.05;

    double taxPrice(Product product) {
        double price = switch (product.getCategory()) {
            case "Usługi" -> product.getPriceNet() * (1 + TAX_23);
            case "Produkt spożywczy" -> product.getPriceNet() * (1 + TAX_5);
            default -> product.getPriceNet() * (1 + TAX_8);
        };
        return price;
    }
}
