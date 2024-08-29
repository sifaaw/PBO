import java.math.BigInteger;
import java.util.Scanner;

public class DataTypesChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt();  // Membaca jumlah kasus uji dari input pengguna

        for (int i = 0; i < T; i++) {
            System.out.print("Enter a number: ");
            String input = scanner.next();  // Membaca input sebagai string

            // Menggunakan BigInteger untuk menangani angka yang sangat besar
            BigInteger n = new BigInteger(input);

            // Menentukan batasan untuk setiap tipe data
            BigInteger byteMin = BigInteger.valueOf(Byte.MIN_VALUE);
            BigInteger byteMax = BigInteger.valueOf(Byte.MAX_VALUE);
            BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
            BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
            BigInteger intMin = BigInteger.valueOf(Integer.MIN_VALUE);
            BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
            BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
            BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);

            // Memeriksa dan mencetak tipe data yang dapat menyimpan nilai n
            boolean canBeFitted = false;
            System.out.println(n + " can be fitted in:");
            if (n.compareTo(byteMin) >= 0 && n.compareTo(byteMax) <= 0) {
                System.out.println("* byte");
                canBeFitted = true;
            }
            if (n.compareTo(shortMin) >= 0 && n.compareTo(shortMax) <= 0) {
                System.out.println("* short");
                canBeFitted = true;
            }
            if (n.compareTo(intMin) >= 0 && n.compareTo(intMax) <= 0) {
                System.out.println("* int");
                canBeFitted = true;
            }
            if (n.compareTo(longMin) >= 0 && n.compareTo(longMax) <= 0) {
                System.out.println("* long");
                canBeFitted = true;
            }

            // Jika tidak bisa dimuat di mana pun
            if (!canBeFitted) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
