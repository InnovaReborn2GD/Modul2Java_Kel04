package id.innovareborn.praktikum.modul2;
import java.util.Scanner;

public class PercobaanIfElifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Warna : ");
        String warna = scan.nextLine();
        if (warna.equalsIgnoreCase("Hitam")) {
            System.out.println("Ramaikan, lalu " + warna + "kan!!!");
        } else if (warna.equalsIgnoreCase("Putih")) {
            System.out.println("Anda suka warna putih :3 ");
        } else if (warna.equalsIgnoreCase("Rainbow")) {
            System.out.println("Hidupmu terlalu berwarna untuk aku yang masih abu abu :') ");
        } else {
            System.out.println("Lo ga diajak brok");
        }
    }
}