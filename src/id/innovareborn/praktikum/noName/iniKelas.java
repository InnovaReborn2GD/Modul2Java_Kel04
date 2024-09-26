package id.innovareborn.praktikum.noName;
import java.util.Scanner;

public static void mobil4(String[] mobil4, int[] harga4) {
    System.out.println("Silakan pilih mobil yang anda inginkan:");
    for (int i = 0; i < mobil4.length; i++) {
        System.out.println((i + 1) + ". " + mobil4[i] + " (IDR " + harga4[i] + " juta)"); }
    Scanner scan11 = new Scanner(System.in);
    System.out.print("Masukkan pilihan anda: ");
    int mobil_cat4 = scan11.nextInt();
}
}
