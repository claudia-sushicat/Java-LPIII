import java.util.Scanner;

public class Lista {

    public static void exercicio_um(int n){
        for(int i = 2; i < n; i++){
            if (n%i == 0){
                System.out.println("nao e primo");
                return ;
            }
        }
        System.out.println("é primo");

    }
    public static void main(String[] arg){
        Scanner scan =  new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        exercicio_um(n);
    }




}
