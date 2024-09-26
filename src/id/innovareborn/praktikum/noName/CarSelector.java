package id.innovareborn.praktikum.noName;
import java.util.Scanner;

public class CarSelector {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat datang di Innova Cars!! CarSelector v1.00");
        System.out.print("Masukkan budget (Dalam ratusan juta): ");
        int budget = scan.nextInt();

        if (budget >= 1000) {
            String[] mobil1 = {"Ford Ranger Raptor 2024", "BMW M4 Competition 2022", "Porsche 911 GT3 RS 2016"};
            int[] harga1 = {1240, 2400, 7600};

            System.out.println("Anda memiliki budget IDR " + budget + " juta.");
            System.out.println("Silakan pilih mobil yang anda inginkan:");
            for (int i = 0; i < mobil1.length; i++) {
                System.out.println((i + 1) + ". " + mobil1[i] + " (IDR " + harga1[i] + " juta)");}
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Masukkan pilihan anda: ");
            int mobil_cat1 = scan2.nextInt();

            switch (mobil_cat1) {
                case (1):
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil1[0] + " seharga " + harga1[0] + " juta?");
                    String konfirmasi = scan3.nextLine();

                    if (konfirmasi.equalsIgnoreCase("ya") && budget >= harga1[0]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (konfirmasi.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (konfirmasi.equalsIgnoreCase("ya") && budget <= harga1[0]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (2):
                    Scanner scan4 = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil1[1] + " seharga " + harga1[1] + " juta?");
                    String konfirmasi2 = scan4.nextLine();

                    if (konfirmasi2.equalsIgnoreCase("ya") && budget >= harga1[1]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (konfirmasi2.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (konfirmasi2.equalsIgnoreCase("ya") && budget <= harga1[1]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (3):
                    Scanner scan5 = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil1[2] + " seharga " + harga1[2] + " juta?");
                    String confirm = scan5.nextLine();

                    if (confirm.equalsIgnoreCase("ya") && budget >= harga1[2]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (confirm.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (confirm.equalsIgnoreCase("ya") && budget <= harga1[2]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan anda tidak sah, silakan coba lagi.");
            }
        }
        else if (budget >= 500 && budget <= 999) {
            String[] mobil2 = {"Toyota Fortuner 2.8 GR-S 4x4 2024", "Mitsubishi Pajero Sport Dakar 4x2 2021",
                    "Suzuki Jimny 5-Door 2023"};
            int[] harga2 = {740, 554, 510};

            System.out.println("Anda memiliki budget IDR " + budget + " juta.");
            System.out.println("Silakan pilih mobil yang anda inginkan:");
            for (int i = 0; i < mobil2.length; i++) {
                System.out.println((i + 1) + ". " + mobil2[i] + " (IDR " + harga2[i] + " juta)");}
            Scanner scan6 = new Scanner(System.in);
            System.out.print("Masukkan pilihan anda: ");
            int mobil_cat2 = scan6.nextInt();

            switch (mobil_cat2) {
                case (1):
                    Scanner scan7 = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil2[0] + " seharga IDR " + harga2[0] + " juta?");
                    String confirm1 = scan7.nextLine();

                    if (confirm1.equalsIgnoreCase("ya") && budget >= harga2[0]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (confirm1.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (confirm1.equalsIgnoreCase("ya") && budget <= harga2[0]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (2):
                    Scanner scan8 = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil2[1] + " seharga IDR " + harga2[1] + " juta?");
                    String confirm2 = scan8.nextLine();

                    if (confirm2.equalsIgnoreCase("ya") && budget >= harga2[1]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (confirm2.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (confirm2.equalsIgnoreCase("ya") && budget <= harga2[1]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (3):
                    Scanner scan9 = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil2[2] + " seharga " + harga2[2] + " juta?");
                    String confirm3 = scan9.nextLine();

                    if (confirm3.equalsIgnoreCase("ya") && budget >= harga2[2]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (confirm3.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (confirm3.equalsIgnoreCase("ya") && budget <= harga2[2]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan anda tidak sah, silakan coba lagi.");
            }
        }
        else if (budget >= 250 && budget <= 499) {
            String[] mobil3 = {"Toyota Innova Venturer Diesel 2021", "Mitsubishi Xpander Cross 2023",
                                "Cherry Omoda 5", "Hyundai Stargazer Prime"};
            int[] harga3 = {435, 279, 311, 307};

            System.out.println("Anda memiliki budget IDR " + budget + " juta.");
            System.out.println("Silakan pilih mobil yang anda inginkan:");
            for (int i = 0; i < mobil3.length; i++) {
                System.out.println((i + 1) + ". " + mobil3[i] + " (IDR " + harga3[i] + " juta)");}
            Scanner scan10 = new Scanner(System.in);
            System.out.print("Masukkan pilihan anda: ");
            int mobil_cat3 = scan10.nextInt();

            switch (mobil_cat3) {
                case (1):
                    Scanner s3a = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil3[0] + " seharga " + harga3[0] + " juta?");
                    String c3a = s3a.nextLine();

                    if (c3a.equalsIgnoreCase("ya") && budget >= harga3[0]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c3a.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c3a.equalsIgnoreCase("ya") && budget <= harga3[0]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (2):
                    Scanner s3b = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil3[1] + " seharga " + harga3[1] + " juta?");
                    String c3b = s3b.nextLine();

                    if (c3b.equalsIgnoreCase("ya") && budget >= harga3[1]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c3b.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c3b.equalsIgnoreCase("ya") && budget <= harga3[1]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (3):
                    Scanner s3c = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil3[2] + " seharga " + harga3[2] + " juta?");
                    String c3c = s3c.nextLine();

                    if (c3c.equalsIgnoreCase("ya") && budget >= harga3[2]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c3c.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c3c.equalsIgnoreCase("ya") && budget <= harga3[2]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (4):
                    Scanner s3d = new Scanner(System.in);
                    System.out.println("Apakah anda yaking ingin membeli mobil " + mobil3[3] + " seharga " + harga3[3] + " juta?");
                    String c3d = s3d.nextLine();

                    if (c3d.equalsIgnoreCase("ya") && budget >= harga3[3]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c3d.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c3d.equalsIgnoreCase("ya") && budget <= harga3[3]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan anda tidak sah, silakan coba lagi.");
            }
        }
        else if (budget >= 100 && budget <= 249) {
            String[] mobil4 = {"Toyota Calya 1.2 G 2024", "Daihatsu Ayla 1.2 R ADS 2023",
                                "Toyota Raize GR-S 2024", "Ford Fiesta 1.5 S 2014"};
            int[] harga4 = {167, 192, 238, 129};

            System.out.println("Anda memiliki budget IDR " + budget + "juta.");
            System.out.println("Silakan pilih mobil yang anda inginkan:");
            for (int i = 0; i < mobil4.length; i++) {
                System.out.println((i + 1) + ". " + mobil4[i] + " (IDR " + harga4[i] + " juta)"); }
            Scanner scan11 = new Scanner(System.in);
            System.out.print("Masukkan pilihan anda: ");
            int mobil_cat4 = scan11.nextInt();

            switch (mobil_cat4) {
                case (1):
                    Scanner s4a = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil4[0] + " seharga " + harga4[0] + " juta?");
                    String c4a = s4a.nextLine();

                    if (c4a.equalsIgnoreCase("ya") && budget >= harga4[0]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c4a.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c4a.equalsIgnoreCase("ya") && budget <= harga4[0]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (2):
                    Scanner s4b = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil4[1] + " seharga " + harga4[1] + "juta?");
                    String c4b = s4b.nextLine();

                    if (c4b.equalsIgnoreCase("ya") && budget >= harga4[1]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c4b.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c4b.equalsIgnoreCase("ya") && budget <= harga4[1]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (3):
                    Scanner s4c = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil4[2] + " seharga " + harga4[2] + "juta?");
                    String c4c = s4c.nextLine();

                    if (c4c.equalsIgnoreCase("ya") && budget >= harga4[2]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c4c.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c4c.equalsIgnoreCase("ya") && budget <= harga4[2]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                case (4):
                    Scanner s4d = new Scanner(System.in);
                    System.out.println("Apakah anda yakin ingin membeli mobil " + mobil4[3] + " seharga " + harga4[3] + "juta?");
                    String c4d = s4d.nextLine();

                    if (c4d.equalsIgnoreCase("ya") && budget >= harga4[3]) {
                        System.out.println("Pembelian berhasil! Mobil anda akan diproses sesaat lagi!");
                    } else if (c4d.equalsIgnoreCase("tidak")) {
                        System.out.println("Pembelian dibatalkan.");
                    } else if (c4d.equalsIgnoreCase("ya") && budget <= harga4[3]) {
                        System.out.println("Mohon maaf, saldo anda belum cukup untuk melakukan pembayaran ini.");
                    } else {
                        System.out.println("Pilihan tidak sah. Pembelian anda dibatalkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan anda tidak sah, silakan coba lagi.");
            }
        }
        else {
            System.out.println("Pilihan yang anda masukkan tidak sah, silakan coba lagi.");
        }
    }
}
