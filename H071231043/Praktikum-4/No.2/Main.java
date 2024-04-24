class Buku {
    String judul, pengarang, genre, sinopsis;
    double durasi;

    Buku () {};
    Buku(String judul, String pengarang, String genre, String sinopsis, double durasi){
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.durasi = durasi;
    }

    void displayInfo() {
        System.out.println("Judul :" + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Genre : " + genre);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("Durasi : " + durasi);
        
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public double getDurasi() {
        return durasi;
    }
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }
    

}


public class Main {
    public static void main(String[] args) {
       Buku buku = new Buku();
       buku.setJudul("Hujan");
       buku.setPengarang("Tere Liye");
       buku.setGenre("Romance");
       buku.setSinopsis("sembarang");
       buku.setDurasi(20);

        buku.displayInfo();

        Buku buku1 = new Buku("Matahari", "tere liye", "action", "sembarang", 30);
        System.out.println(buku1.getJudul());
        System.out.println(buku1.getPengarang());
        System.out.println(buku1.getGenre());
        System.out.println(buku1.getSinopsis());
        System.out.println(buku1.getDurasi());
       
        SelfUtils.displaySelfData();
    }
}

class SelfUtils {
    public static void displaySelfData() {
        System.out.println("Nama    : Diza Sazkia");
        System.out.println("NIM     : H071231043");
    }
}