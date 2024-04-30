package Programacao_Sistemas.Associacao_de_classes.ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializa variáveis
        Pessoa p1 = new Pessoa();
        Veiculo veiculo = new Veiculo();
        Scanner s = new Scanner(System.in);

        //Preenche o nome da pessoa
        System.out.println("Qual o nome do Dono ? : ");
        String nome = s.nextLine();
        p1.setNome(nome);

        //Preenche a placa do carro
        System.out.println("Qual a placa so seu veiculo ? :");
        String placa = s.nextLine();
        veiculo.setPlaca(placa);

        //Apresenta dados sobre o veículo e seu Dono
        veiculo.vender(p1);
    }
}
