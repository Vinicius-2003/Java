package ex001.src;
import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Digite o valor de N : ");
        int num = entradaUser.nextInt();

        double soma = 0.0;

        for(int count=1; count <= num; count++){
            soma += (double) count / (double)(num-count+1);
        }
        System.out.printf("Resultado : %d" + soma);
        entradaUser.close();
    }
}