import java.util.ArrayList;
import java.util.Scanner;
import Sound.Audio;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Data Karyawan:");
            System.out.println("a. Tambah data Karyawan \nb. Tampilkan detail karyawan \nc. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String opsi = scan.nextLine();
            switch (opsi) {
                case "a":
                    String nama;
                    while(true){
                        System.out.print("Masukkan nama: ");
                        nama = scan.nextLine();
                        if(nama.isEmpty()){
                            System.out.println("inputan kosong, silahkan masukkan nama");
                        }else{
                            break;
                        }
                    }
                    int umur;
                    while (true) {
                        System.out.print("Masukkan umur: ");
                        try {
                            umur = Integer.parseInt(scan.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Input yang dimasukkan bukan angka. Silakan coba lagi.");
                        }
                    }
                    
                    Pengalaman pengalaman = new Pengalaman();
                    pengalaman.prosesKehidupan(scan);

                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.prosesPendidikan(scan);

                    Keluarga keluarga = new Keluarga();
                    keluarga.statusKeluarga(scan);

                    Projek projek = new Projek();
                    projek.jenisProjek(scan);
                    
                    int jumlahProjek = projek.getJumlahProjek();
                    String inputPendidikan = pendidikan.getInputPendidikan();
                    
                    if (!inputPendidikan.equalsIgnoreCase("SD") && !inputPendidikan.equalsIgnoreCase("SMP") && jumlahProjek > 4 && umur >= 18) {
                        System.out.println("Pengalaman sedang diproses...");
                        System.out.println("Pendidikan terakhir: " + inputPendidikan);
                        System.out.println("Jumlah projek IT: " + jumlahProjek);
                        Audio.playSound("SuccesSound.wav");
                        System.out.println("============================");
                        System.out.println("Selamat, karyawan diterima!");
                        System.out.println("============================");
                        pengalaman.gajiSebelumnya += 2000000;
                        Karyawan karyawan = new Karyawan(nama, umur, inputPendidikan, pengalaman.gajiSebelumnya); 
                        daftarKaryawan.add(karyawan); 
                    } else {
                        Audio.playSound("FailedSound.wav");
                        System.out.println("Karyawan tidak memenuhi syarat.");
                    }
                    break;
                case "b":
                    if (daftarKaryawan.isEmpty()) {
                        System.out.println("Belum ada data karyawan");
                    } else {
                        System.out.println("Detail Semua Karyawan:");
                        for (Karyawan karyawan : daftarKaryawan) {
                            karyawan.tampilkanDetilKaryawan();
                        }
                    }
                    break;
                case "c":
                    System.out.println("Terima kasih!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Inputan tidak valid. Silahkan masukkan a-c");
            }
        }
        scan.close();
    }
}
