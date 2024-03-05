import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor : ");
            vetor[i] = entrada.nextInt();
        }
        System.out.print("Vetor originial : ");
        for (int valor : vetor)
            System.out.printf("%d ,",valor);

        for(int i =0; i<vetor.length;i++){
            if(vetor[i]==0){
                aux = vetor[vetor.length];
                vetor[vetor.length] = vetor[i];
            }
        }
    }
}