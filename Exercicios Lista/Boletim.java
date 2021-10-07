import java.util.Scanner;

public class Boletim {

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        float av_um = Float.parseFloat(scan.nextLine());
        float av_dois = Float.parseFloat(scan.nextLine());
        float av_opt =  Float.parseFloat(scan.nextLine());
        float media = 0;
            if (av_opt == -1 ){
                media =  (av_um + av_dois)/2;
            } else if (av_um > av_dois) {
                 media =  (av_um + av_opt)/2;
            } else if (av_um < av_dois ) {
                media =  (av_opt + av_dois)/2;
            }
            System.out.println(media);

            if (media >= 6.0){
                System.out.println("Aprovado");
            } else if (media < 3.0){
                System.out.println("Reprovado");
            }
    }
}
