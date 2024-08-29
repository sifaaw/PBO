import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk menginput string A
        System.out.print("Masukkan string A: ");
        String A = scanner.nextLine();

        // Meminta pengguna untuk menginput string B
        System.out.print("Masukkan string B: ");
        String B = scanner.nextLine();

        System.out.println(" ");
        System.out.println("Hasil: ");

        // 1. Jumlahkan panjang A dan B
        int lengthSum = A.length() + B.length();
        System.out.println("Jumlah panjang A dan B: " + lengthSum);

        // 2. Tentukan apakah A secara leksikografis lebih besar dari B
        if (A.compareTo(B) > 0) {
            System.out.println("Yesss");
        } else {
            System.out.println("Noo");
        }

        // 3. Kapitalisasi huruf pertama pada A dan B dan cetak dalam satu baris
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println("kapitalisasi: " + capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
