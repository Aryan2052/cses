import java.util.Scanner;

public class solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.print(n+" ");

        while(n>1){
            if(n%2!=0){
                n = (n*3) + 1;
                System.out.print(n+" ");
            }
            if(n%2==0){
                n = n/2;
                System.out.print(n+" ");
            }
        }
    }
}