import java.util.Scanner;

public class tugasIndividu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();

        int[] arr14 = new int[n];
        System.out.println("Masukkan nilai tiap elemen:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr14[i] = scanner.nextInt();
        }

        int max = arr14[0];
        int min = arr14[0];
        int sum = arr14[0];

        for (int i = 1; i < n; i++) {
            if (arr14[i] > max) {
                max = arr14[i];
            }

            if (arr14[i] < min) {
                min = arr14[i];
            }

            sum += arr14[i];
        }

        double rata = (double) sum / n;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + rata);

        scanner.close();
    }
}
