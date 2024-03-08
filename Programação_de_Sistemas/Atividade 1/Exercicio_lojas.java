import java.util.Scanner;
import java.util.Arrays;

public class Exercicio_lojas {
    public static float[] entrada(float[] vetor) {
        Scanner entradaUser = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Preço da loja %d : ", i + 1);
            vetor[i] = entradaUser.nextFloat();
        }
        entradaUser.close();
        return vetor;
    }

    public static float mediaPrecos(float[] vetor) {
        float media = 0;
        float soma_preco = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma_preco += vetor[i];
        }
        media = soma_preco / vetor.length;
        return media;
    }

    public static int contaLojas(float media, float[] vetor) {
        int preco_acima_media = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                preco_acima_media++;
            }
        }
        return preco_acima_media;
    }

    public static void main(String[] args) {
        float[] preco_loja = new float[10];

        preco_loja = entrada(preco_loja);
        System.out.println(Arrays.toString(preco_loja));

        float preco_medio = mediaPrecos(preco_loja);
        System.out.printf("O preço médio do produto é de %.2f R$", preco_medio);

        int lojas_acima_media = contaLojas(preco_medio, preco_loja);
        System.out.printf("\nHá %d lojas acima da média de preços!", lojas_acima_media);

    }
}
