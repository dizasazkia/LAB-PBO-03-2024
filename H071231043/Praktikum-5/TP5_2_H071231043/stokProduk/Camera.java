package TP5_2_H071231043.stokProduk;

public class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(int resolution, String lensType, String brand, int seriesNumber, double price) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution\t: " + this.resolution + " MP");
        System.out.println("Lens Type\t: " + this.lensType);
    } 
}
