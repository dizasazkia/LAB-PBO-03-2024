package TP5_2_H071231043.stokProduk;

public class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    public Smartphone (double screenSize, int storageCapacity, String brand, int seriesNumber, double price){
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size\t: " + this.screenSize + " inches");
        System.out.println("Strorage Capacity: " + this.storageCapacity + " GB");
    }
}