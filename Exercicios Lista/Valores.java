import java.util.Scanner;

public class Valores {
    public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
    // tipo um input, eu crio um objeto que recebe tudo o que o usuario digita ( pela função System.in)
        int a = Integer.parseInt(scan.nextLine());
        // eu nao coloquei um system.out.println pra pedir o valor da base que nesse caso é a porém é o primeiro valor que voce deve inputar, o da base
        int n = Integer.parseInt(scan.nextLine());
        // em seguida, voce deve inputar o valor do expoente
        System.out.println(Math.pow(a,n));
        // o math.pow tambem existe no javascript, ele recebe respectivamente a base e o expoente daí é só dar um system.out.println(função(x,y)) que ele calcula bonitinho
    }

}
