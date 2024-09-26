package id.innovareborn.praktikum.modul2;
import java.util.Scanner;

public class PercobaanIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("MASUKKAN NILAI UJIAN : ");
        int a = scan.nextInt();
        if (a<80) {
            System.out.println("Nilai yang dimasukkan adalah " + a + ", anda dinyatakan tidak lolos, tetap semangat dan jangan putus asa!!");
        }
        else {
            System.out.println("Nilai yang dimasukkan adalah " + a + ", anda dinyatakan lulus!");
        }
    }
}

