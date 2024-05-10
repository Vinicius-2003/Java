package Programacao_Sistemas.Projeto;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Motorista m1 = new Motorista();
        Motorista m2 = new Motorista();

        m1.setNome("Vinícius Silva Almeida");
        m1.setEndereco("Rua Dona Antônia de Queirós, 588");

        m1.mostrar_nome();
        m1.mostrar_endereco();

        m2.setNome("Mariana Restani");
        m2.setEndereco("Lagoinha");

        System.out.println();
//        m2.mostrar_nome();
//        m2.mostrar_endereco();


    }
}
