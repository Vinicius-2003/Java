import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10]; // Criar o vetor
        int procurar; // Aramzena o valor a ser procurado
        int count = 0;

        for (int i = 0; i < vetor.length; i++) { // Preencher o vetor com o valores do usuário
            System.out.print("Me dê um número : ");
            vetor[i] = entrada.nextInt();
        }
        System.out.print("Valor a procurar : ");
        procurar = entrada.nextInt();

        while (count < vetor.length){
            if (vetor[count] == procurar) {
                System.out.printf("Valor %d encontrado na posição %d", procurar, count);
                break;
            }
            count++;
        }
        if (count == vetor.length){
            System.out.print("Valor não encontrado!");
        }
        entrada.close();
    }
}

