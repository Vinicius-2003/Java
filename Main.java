import java.util.Scanner;

public class Main {
    // public static int vetor_positivo(int[] vetor, int[] vetor_positivo) {
    // int qtd_positivo = 0;
    // int count = 0;
    // for (int j = 0; j < vetor.length; j++) {
    // if (vetor[j] >= 0) {
    // vetor_positivo[count] = vetor[j];
    // count++;
    // qtd_positivo++;
    // }
    // }
    // return qtd_positivo;
    // }
    public static void vetor_positivo(int[] vetor, int[] vetor_positivo) {
        int qtd_positivo = 0;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] >= 0) {
                vetor_positivo[qtd_positivo] = vetor[j];
                qtd_positivo++;
            }
        }
        for (int i = 0; i < qtd_positivo;i++){
            System.out.print(vetor_positivo);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetor_positivo = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }
        vetor_positivo(vetor, vetor_positivo);
        entrada.close();

    }

}