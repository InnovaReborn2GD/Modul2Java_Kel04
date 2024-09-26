import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total tagihan
        System.out.print("Masukkan total tagihan Anda: Rp");
        double totalTagihan = scanner.nextDouble();
        double diskon = 0;

        // Menghitung diskon berdasarkan total tagihan
        if (totalTagihan > 1000000) {
            diskon = totalTagihan * 0.15;
            System.out.println("Total tagihan Anda sebesar Rp" + totalTagihan + " dengan tambahan diskon 15%");
        } else if (totalTagihan >= 500000) {
            diskon = totalTagihan * 0.10;
            System.out.println("Total tagihan Anda sebesar Rp" + totalTagihan + " dengan tambahan diskon 10%");
        } else {
            System.out.println("Total tagihan Anda sebesar Rp" + totalTagihan + " tanpa diskon");
        }

        // Menghitung total setelah diskon
        double totalSetelahDiskon = totalTagihan - diskon;

        // Memilih metode pembayaran
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit Bank Mega(wati)");
        System.out.println("3. Gopay");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = scanner.nextInt();
        double biayaTambahan = 0;

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Transfer Bank, tidak dikenakan biaya tambahan.");
                break;
            case 2:
                biayaTambahan = totalSetelahDiskon * 0.02;
                totalSetelahDiskon += biayaTambahan;
                System.out.println("Anda memilih Kartu Kredit, dikenakan biaya admin 2% Rp" + biayaTambahan);
                break;
            case 3:
                double diskonTambahan = totalSetelahDiskon * 0.05;
                totalSetelahDiskon -= diskonTambahan;
                System.out.println("Anda memilih E-Wallet, diskon tambahan 5% sebesar Rp" + diskonTambahan);
                break;
            default:
                System.out.println("Pilihan yang anda masukka tidak sah, silahkan coba lagi.");
                break;
        }

        // Menampilkan total akhir
        System.out.println("Total akhir yang harus dibayar: Rp" + totalSetelahDiskon);
        scanner.close();
    }
}