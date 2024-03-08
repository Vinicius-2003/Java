package Programação_de_Sistemas.Laços;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        // Criar as variáveis
        Scanner entrada = new Scanner(System.in);
        int continuar = 0;
        int sexo = 0;
        float altura_homem = 0.0f;
        float altura_mulher = 0.0f;
        float maior = 0.0f;
        float menor = 1.60f;
        int homens = 0;
        int mulheres = 0;
        float total_pessoas;
        float total_altura = 0;
        float total_altura_mulher = 0.0f;
        do {
            System.out.print("Sexo (0 - Homem / 1 - Mulher) : ");
            sexo = entrada.nextInt();
            if (sexo == 0) {
                System.out.print("Altura (Homem): ");
                altura_homem = entrada.nextFloat();
                homens++;
                total_altura += altura_homem;
                System.out.println(total_altura);
                if (altura_homem > maior) {
                    maior = altura_homem;
                } else if (altura_homem < menor) {
                    menor = altura_homem;
                }
                System.out.print("Deseja continuar ? (0 - Sim / 1 - Não) : ");
                continuar = entrada.nextInt();
            } else {
                System.out.print("Altura (Mulher): ");
                altura_mulher = entrada.nextFloat();
                total_altura_mulher += altura_mulher;
                total_altura += altura_mulher;
                mulheres++;
                System.out.println(total_altura);
                if (altura_mulher > maior) {
                    maior = altura_mulher;
                } else if (altura_mulher < menor) {
                    menor = altura_mulher;
                }
                System.out.print("Deseja continuar ? (0 - Sim / 1 - Não) : ");
                continuar = entrada.nextInt();
            }
        } while (continuar == 0);
        total_pessoas = homens + mulheres;
        System.out.printf("A maior altura : %.1f", maior);
        System.out.printf("\nA menor altura : %.1f", menor);
        System.out.printf("\nA média da altura das mulheres : %.2f", (total_altura_mulher/ mulheres));
        System.out.printf("\nA média de altura da população : %.2f", (total_altura / total_pessoas));
        System.out.printf("\nO percentual de homens na população : %.2f ", (homens / total_pessoas) * 100);
        entrada.close();
    }
}
