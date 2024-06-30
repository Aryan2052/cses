import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        StringBuilder output = new StringBuilder();
        
        if (n == 1) {
            output.append(n);
        } else if (n > 1 && n <= 3) {
            output.append("NO SOLUTION");
        } else if (n == 4) {
            output.append("3 1 4 2");
        } else {
            // Append even numbers first
            for (int i = 2; i <= n; i += 2) {
                output.append(i).append(" ");
            }
            // Append odd numbers next
            for (int i = 1; i <= n; i += 2) {
                output.append(i).append(" ");
            }
        }
        
        // Print all at once
        System.out.println(output.toString().trim());
    }
}
