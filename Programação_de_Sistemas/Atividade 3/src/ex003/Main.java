package ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Funcionario f1 = new Funcionario("Antonio ferreira","Vendas","12345678-0",3000);
        f1.recebeAumento(20);
        f1.exibeInformacoes();
        f1.calculaGanhoAnual();
    }
}
