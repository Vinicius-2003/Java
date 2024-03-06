import java.util.Scanner;

public class Main {
    public static void vetor_positivo(int[] vetor_inicial, int[] vetor_positivo) {
        int count = 0; //Esse contador só vai funcionar quando o valor for positivo
        for(int i = 0; i<vetor_inicial.length;i++){ //percorre o vetor inicial 
            if(vetor_inicial[i]> 0){ //verifica se o valor é positivo
                vetor_positivo[count] = vetor_inicial[i]; //colocar o valor positivo no vetor_positivo
                count++; //acrescenta uma posição no contador
            }
        }
        System.out.println(); //pula uma linha 
        for (int j = 0; j<count;j++){ //percorre o vetor_positivo
            System.out.println(vetor_positivo[j]); //printa linha por linha do vetor
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor_inicial = new int[10]; //cria os vetores
        int[] vetor_positivo = new int[10];

        for (int i = 0; i < vetor_inicial.length; i++) { //Completa o vetor inicial 
            vetor_inicial[i] = entrada.nextInt();
        }
        vetor_positivo(vetor_inicial, vetor_positivo); //chama a função para realizar a operação
        entrada.close(); //fecha o Scanner
    }
}