package id.innovareborn.praktikum.modul2;
import java.util.Scanner;

public class PercobaanIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = scan.nextInt();
        if (a>=0) {
            System.out.println("Angka ini positif");
            }
        System.out.println("Selesai");
    }
}
