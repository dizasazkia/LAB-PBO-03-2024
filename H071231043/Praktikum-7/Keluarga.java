import java.util.Scanner;

public class Keluarga {
    String status;
    void statusKeluarga(Scanner scan) {
        while (true) {
            System.out.print("Status(Menikah/Belum Menikah): ");
            status = scan.nextLine().toLowerCase();
            if (status.equals("menikah") || status.equals("belum menikah")){
                break;
            } else {
                System.out.println("Inputan yang dimasukkan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

