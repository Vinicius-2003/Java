import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vetor = new int[10];
        int maior = 0;
        int contador = 0;
        int posição = 0;

        for(int i = 0; i<vetor.length;i++){
            System.out.print("Digite um valor : ");
            vetor[i] = entrada.nextInt();
        }
        while(contador < vetor.length){
            if (vetor[contador] > maior){
                maior = vetor[contador];
                posição = contador;
            }
            contador++;
        }
        System.out.printf("O valor %d é o maior e encontra-se na posição %d !",maior,posição);
        entrada.close();
    }
}
