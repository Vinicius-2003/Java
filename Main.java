import java.util.Scanner;

public class Main {

    public static int vetor_positivos(int[] vetor_inicial, int[] vetor_positivo) {
        int count = 0;
        for (int i = 0; i < vetor_inicial.length; i++) {
            if (vetor_inicial[i] > 0) {
                vetor_positivo[count] = vetor_inicial[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int[] positivos = new int[10];
        int x = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();
        }

        x = vetor_positivos(vetor, positivos);

        System.out.println();
        if (x > 0) {
            for (int i = 0; i < x; i++) {
                System.out.println(positivos[i]);
            }
        } else {
            System.out.println("Nenhum valor positivo adicionado.");
        }
        input.close();
    }
}