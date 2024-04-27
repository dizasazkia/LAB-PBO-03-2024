package TP5_2_H071231043;

import java.util.ArrayList;
import java.util.Scanner;
import TP5_2_H071231043.stokProduk.Product;
import TP5_2_H071231043.stokProduk.Smartphone;
import TP5_2_H071231043.stokProduk.Camera;
import TP5_2_H071231043.stokProduk.Laptop;

public class TP5_2_H071231043 {
    private static ArrayList<Product> stokProduk = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
       menu(); 
    }
    private static void menu(){
        while(true){
            System.out.println("\nMenu : ");
            System.out.println("\n1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("\n>>> Pilih Menu (1-4) : ");
            int pilihMenu = scan.nextInt();
            scan.nextLine();

            switch (pilihMenu) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    if(stokProduk.isEmpty()){
                        System.out.println("Daftar Produk Kosong");
                    }else{
                        tampilkanProduk();
                    }
                    break;
                case 3:
                    if(stokProduk.isEmpty()){
                        System.out.println("Daftar Produk Kosong");
                    }else{
                        beliProduk();;
                    }
                    break;
                case 4:
                    System.out.println("\nTerimakasih telah menggunakan layanan kami. Sampai Jumpa!!");
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void tambahProduk(){
        System.out.print("\nMasukkan nama produk: ");
        String brand = scan.nextLine(); 
        System.out.print("Masukkan nomor Seri : ");
        int nomorSeri = scan.nextInt();
        System.out.print("Masukkan harga      : ");
        double harga = scan.nextDouble();
        
        System.out.println("\nPilih tipe produk: ");
        
        System.out.println("\n1. Smarthphone ");
        System.out.println("2. Camera ");
        System.out.println("3. Laptop ");
        
        System.out.print("\nPilih tipe produk (1-3): ");
        int tipeProduk = scan.nextInt();
        
        scan.nextLine();
        switch (tipeProduk) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double ukuranLayar = scan.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int kapasitasPenyimpanan = scan.nextInt();
                stokProduk.add(new Smartphone(ukuranLayar, kapasitasPenyimpanan, brand, nomorSeri, harga));
                break;
            case 2:
                System.out.print("Masukkan resolusi kamera: ");
                int resolusi = scan.nextInt();
                System.out.print("Masukkan tipe lensa     :");
                scan.nextLine();
                String tipeLensa = scan.nextLine();
                stokProduk.add(new Camera(resolusi, tipeLensa, brand, nomorSeri, harga));
                break;
            case 3:
                System.out.print("Masukkan tipe processor: ");
                String jenisProcessor = scan.nextLine();
                System.out.print("Masukkan ukuran RAM    : ");
                int ukuranRAM = scan.nextInt();
                stokProduk.add(new Laptop(ukuranRAM, jenisProcessor, brand, nomorSeri, harga));
                break;
            default:
                break;
        }
    }

    private static void tampilkanProduk(){
        System.out.println("\nDaftar Produk");
        for(Product produk : stokProduk){
            produk.displayInfo();

        }
    }

    private static void beliProduk(){
        System.out.print("\nMasukkan nomor seri yang ingin dibeli: ");
        int nomorSeriygdibeli = scan.nextInt();
        boolean found = false;
        for(Product nomor : stokProduk){
            if(nomor.getSeriesNumber() == nomorSeriygdibeli){
                found = true;
                System.out.println("\nAnda telah membeli produk :");
                nomor.displayInfo();
                stokProduk.remove(nomor);
                break;
            }
        }
        if(!found){
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
        }
    }
}

