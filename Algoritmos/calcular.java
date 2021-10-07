import java.util.Scanner;

public class calcular {

    public static int fibonacci(int n){
        if( n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(fibonacci(n));

    }
}