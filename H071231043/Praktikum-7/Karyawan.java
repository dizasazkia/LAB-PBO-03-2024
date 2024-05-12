public class Karyawan {
    String nama, jabatan;
    int umur;
    String pendidikanTerakhir;
    double gaji;
    Pengalaman pengalaman = new Pengalaman();

    public Karyawan(){};
    
    public Karyawan(String nama, int umur, String pendidikanTerakhir, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = "Karyawan";
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.gaji = gaji;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void tampilkanDetilKaryawan() {
        System.out.println("--------------------------------------------");
        System.out.println("Nama                : " + getNama());
        System.out.println("Umur                : " + getUmur());
        System.out.println("Jabatan             : " + getJabatan());
        System.out.println("Gaji                : " + getGaji());
        System.out.println("Pendidikan Terakhir : " + pendidikanTerakhir);
        System.out.println("--------------------------------------------");
    
    }
}

