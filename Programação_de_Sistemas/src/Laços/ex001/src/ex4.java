package ex001.src;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Cp;
        float Pe;

        System.out.print("Preço Etiqueta : ");
        Pe = entrada.nextFloat();
        System.out.print("Código do Produto : ");
        Cp = entrada.nextInt();

        
        switch (Cp) {
            case 1:
                System.out.println("À vista em dinheiro ou cheque, com 10% de desconto");
                System.out.printf("Preço à pagar : %.1f R$",(Pe * 0.9));
                break;
            case 2:
                System.out.println("À vista com cartão de crédito, com 5% de desconto");
                System.out.printf("Preço à pagar : %.1f R$",(Pe * 0.95));
                break;
            case 3:
                System.out.println("Em 2 vezes, preço normal de etiqueta sem juros");
                System.out.printf("Preço à pagar : 2x%.1f R$",(Pe/2.0));
                break;
            case 4:
                System.out.println("Em 3 vezes, preço de etiqueta com acréscimo de 10%");
                System.out.printf("Preço à pagar : 3x%.1f R$",((Pe * 1.1)/3));
                break;
            default:
                System.out.println("Código Inválido!!");
                break;
        }
        entrada.close();
    }
}
