import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long x;
        long[] arr = new long[(int)n];

        for (int i = 0; i < n - 1; i++) { // Loop should run n-1 times to read the inputs
            x = s.nextLong();
            arr[(int)x - 1] = x;
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                System.out.println(j + 1); // Printing the 1-based index
            }
        }

        s.close();
    }
}
