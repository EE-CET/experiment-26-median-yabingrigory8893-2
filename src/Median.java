import java.util.Scanner;
import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    a[i] = sc.nextInt();
                }
            }
            Arrays.sort(a);
            System.out.println(a[n / 2]);
        }
    }
}

