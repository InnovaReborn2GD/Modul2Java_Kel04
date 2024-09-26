package id.innovareborn.praktikum.challenge;
import java.util.Scanner;

public class pengukurJamTidur {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jam tidur anda: ");
        int a = scan.nextInt();
        if (a<4) {
            System.out.println("Jam tidur anda" + a + ", anda SANGAT KURANG TIDUR");
        }
        else if (a == 5) {
            System.out.println("Jam tidur anda" + a + ", anda KURANG TIDUR");
        }
        else if (a == 7) {


        }
    };
}
