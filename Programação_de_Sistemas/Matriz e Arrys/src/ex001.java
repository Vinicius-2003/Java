import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vetor = new int [10];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número : ");
            vetor[i] = entrada.nextInt();
        }
        int total = 0;
        for(int soma : vetor){
            total += soma;
        }
        System.out.printf("Soma dos valores do vetor : %d",total);
        entrada.close();
    }
}
