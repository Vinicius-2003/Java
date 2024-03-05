import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[6];
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número : ");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 0; j < vetor.length - i- 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        for (int valores : vetor)
            System.out.print(" - "+valores);
        entrada.close();
    }

}
