import java.util.Scanner;

// Bangun Datar

class BangunDatar {
    double panjang, lebar, jari, sisi, sisi1, sisi2, sisi3, sisi4, tinggi;
}

class Persegi extends BangunDatar {

    Persegi(double s) {
        sisi = s;
    }

    double luas() {
        return sisi * sisi;
    }

    double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    double luas() {
        return panjang * lebar;
    }

    double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {

    Lingkaran(double r) {
        jari = r;
    }

    double luas() {
        return Math.PI * jari * jari;
    }

    double keliling() {
        return 2 * Math.PI * jari;
    }
}

class Trapesium extends BangunDatar {

    Trapesium(double s1, double s2, double s3, double s4, double t) {
        sisi1 = s1;
        sisi2 = s2;
        sisi3 = s3;
        sisi4 = s4;
        tinggi = t;
    }

    double luas() {
        return (sisi1 + sisi2) / 2 * tinggi;
    }

    double keliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}

// Bangun Ruang

class BangunRuang {
    double sisi, panjang, lebar, tinggi, jari;
}

class Kubus extends BangunRuang {

    Kubus(double s) {
        sisi = s;
    }

    double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    double volume() {
        return sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {

    Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double luasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    double volume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {

    Bola(double r) {
        jari = r;
    }

    double luasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * jari * jari * jari;
    }
}

class Tabung extends BangunRuang {

    Tabung(double r, double t) {
        jari = r;
        tinggi = t;
    }

    double luasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }

    double volume() {
        return Math.PI * jari * jari * tinggi;
    }
}

public class TP5_1_H071231043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung\n");

        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");
        System.out.println("---------------------------------------");

        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        System.out.println("---------------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = input.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas permukaan kubus: " + kubus.luasPermukaan());
                System.out.println("Volume kubus: " + kubus.volume());
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = input.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Luas permukaan balok: " + balok.luasPermukaan());
                System.out.println("Volume balok: " + balok.volume());
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double jariBola = input.nextDouble();
                Bola bola = new Bola(jariBola);
                System.out.println("Luas permukaan bola: " + bola.luasPermukaan());
                System.out.println("Volume bola: " + bola.volume());
                break;
            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariTabung = input.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = input.nextDouble();
                Tabung tabung = new Tabung(jariTabung, tinggiTabung);
                System.out.println("Luas permukaan tabung: " + tabung.luasPermukaan());
                System.out.println("Volume tabung: " + tabung.volume());
                break;
            case 5:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = input.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi: " + persegi.luas());
                System.out.println("Keliling persegi: " + persegi.keliling());
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = input.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
                System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariLingkaran = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariLingkaran);
                System.out.println("Luas lingkaran: " + lingkaran.luas());
                System.out.println("Keliling lingkaran: " + lingkaran.keliling());
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium: ");
                double sisi1Trapesium = input.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double sisi2Trapesium = input.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double sisi3Trapesium = input.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double sisi4Trapesium = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = input.nextDouble();
                Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                System.out.println("Luas trapesium: " + trapesium.luas());
                System.out.println("Keliling trapesium: " + trapesium.keliling());
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        input.close();
    }
}
