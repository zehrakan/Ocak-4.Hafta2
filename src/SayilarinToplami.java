import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'e kadar olan sayıların toplamı: " + toplam);

        scanner.close();
    }
}