import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        long[] x = new long[n];
        x[0] = s.nextInt(); 
        long a = 0, count = 0;
        
        for (int i = 1; i <n; i++) {
            x[i] = s.nextInt();
            if(x[i-1]> x[i]){
                a = x[i-1] - x[i];
                x[i] = x[i]+a;
                count = count+a;
            }
        }

        System.out.println(count);
    }
}
