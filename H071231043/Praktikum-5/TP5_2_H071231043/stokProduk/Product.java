package TP5_2_H071231043.stokProduk;

public class Product {
    String brand;
    int seriesNumber;
    double price;

    public Product(String brand, int seriesNumber, double price){
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("\nBrand\t\t: " + brand);
        System.out.println("Serial Number\t: " + seriesNumber);
        System.out.println("Price\t\t: $ " + price);
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }
}
