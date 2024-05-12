import java.util.Scanner;

class Pengalaman extends Kehidupan {
    String[] pengalaman = {"Freelancer", "Magang", "Pekerja Tetap", "Tidak ada" };
    int inputPengalaman;
    double gajiSebelumnya;
    String organisasi;
    String inputOganisasi;

    void prosesKehidupan(Scanner scan) {
        System.out.println("Pengalaman sebelumnya:");
        for (int i = 0; i < pengalaman.length; i++) {
            System.out.println((i + 1) + ". " + pengalaman[i]);
        }
        boolean cekInput = false;
        do {
            try {
                System.out.print("Input: ");
                inputPengalaman = Integer.parseInt(scan.nextLine());
                if (inputPengalaman >= 1 && inputPengalaman <= pengalaman.length) {
                    cekInput = true;
                } else {
                    System.out.println("inputan tidak lebih valid. Silahkan masukkan angka 1-4");
                }
            }catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka");
            }
        } while (!cekInput);
        if (inputPengalaman != 4) {
            System.out.print("Gaji sebelumnya: ");
            gajiSebelumnya = Double.parseDouble(scan.nextLine());
        }
        System.out.print("Pengalaman Organisasi: ");
        inputOganisasi = scan.nextLine();
    }
    public String[] getPengalaman() {
        return pengalaman;
    }
    public void setPengalaman(String[] pengalaman) {
        this.pengalaman = pengalaman;
    }
    public int getInputPengalaman() {
        return inputPengalaman;
    }
    public void setInputPengalaman(int inputPengalaman) {
        this.inputPengalaman = inputPengalaman;
    }
    public double getGajiSebelumnya() {
        return gajiSebelumnya;
    }
    public void setGajiSebelumnya(double gajiSebelumnya) {
        this.gajiSebelumnya = gajiSebelumnya;
    }
    public String getOrganisasi() {
        return organisasi;
    }
    public void setOrganisasi(String organisasi) {
        this.organisasi = organisasi;
    }
    public String getInputOganisasi() {
        return inputOganisasi;
    }
    public void setInputOganisasi(String inputOganisasi) {
        this.inputOganisasi = inputOganisasi;
    }
}
