package id.innovareborn.praktikum.challenge;
import java.util.Scanner;

public class swBulan {
    public static void main(String[] args) {
        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
                "Agustus", "September", "Oktober", "November", "Desember"
        };

        String[] jumlahHari = {
                "31", "28 atau 29", "31", "30", "31", "30", "31",
                "31", "30", "31", "30", "31"
        };

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nomor bulan (1-12): ");

        int bulan = scan.nextInt();

        if (bulan >= 1 && bulan <= 12) {
            System.out.println(namaBulan[bulan - 1] + " memiliki " + jumlahHari[bulan - 1] + " hari.");
        } else {
            System.out.println("Pilihan yang anda masukkan tidak sah, silakan coba lagi.");
        }
    }
}