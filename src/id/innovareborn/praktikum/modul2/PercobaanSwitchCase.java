package id.innovareborn.praktikum.modul2;
import java.util.Scanner;

public class PercobaanSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Tirai : ");
        String tirai = scan.nextLine();
        switch(tirai) {
            case ("tirai 1") :System.out.println("Selamat, anda memenangkan iPhone 16 Pro Max!!");
                break;
            case ("tirai 2") :System.out.println("Selamat, anda memenangkan 1 unit mobil Land Cruiser 300 GR-S!!");
                break;
            case ("tirai 3") :System.out.println("ZONK !!");
                break;
            default: System.out.println("Pilihan yang anda masukkan tidak sah, silakan coba lagi.");
                break;
        }
    }
}
