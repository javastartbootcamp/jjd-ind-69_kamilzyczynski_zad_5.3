package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Roboty żelbetowe", "Wykonanie stanu surowego budynku przedszkola",
                1_000_000, "Usługi");
        Product product2 = new Product("Chleb żytni", "Świeży chleb z piekarni",
                5.99, "Produkt spożywczy");
        Product product3 = new Product("Telewizor", "Telewizor LCD 42 cale",
                2345.99, "RTV");

        TaxCalculate taxCalculate = new TaxCalculate();
        double price1gross = taxCalculate.taxPrice(product1);
        double price2gross = taxCalculate.taxPrice(product2);
        double price3gross = taxCalculate.taxPrice(product3);

        System.out.println("Produkt: " + product1.getName());
        System.out.printf("Cena netto: %.2f \n", product1.getPriceNet());
        System.out.printf("Cena brutto: %.2f \n", price1gross);

        System.out.println("Produkt: " + product2.getName());
        System.out.printf("Cena netto: %.2f \n", product2.getPriceNet());
        System.out.printf("Cena brutto: %.2f \n", price2gross);

        System.out.println("Produkt: " + product3.getName());
        System.out.printf("Cena netto: %.2f \n", product3.getPriceNet());
        System.out.printf("Cena brutto: %.2f \n", price3gross);

    }
}
