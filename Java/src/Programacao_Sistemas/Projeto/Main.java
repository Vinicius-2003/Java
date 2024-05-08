package Programacao_Sistemas.Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<String> senha_array = new ArrayList<>();
        ArrayList<String> cpf_array = new ArrayList<>();


        int opcao;
        do {

            System.out.println("-=-=-=-=-=-Menu-=-=-=-=-=-");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Logar\n");
            System.out.print("Opção : ");
            opcao = s.nextInt();

            if(opcao == 1){ //Cadastrar dados do cliente
                System.out.println("Digite seu cpf ");
                System.out.print("cpf : ");
                s.nextLine();
                String cpf = s.nextLine();
                cpf_array.add(cpf);

                System.out.print("Cadastre sua senha : ");
                System.out.print("senha : ");
                s.nextLine();
                String senha_cadastro = s.nextLine();
                senha_array.add(senha_cadastro);

                continue;
            }
            if(opcao == 2){ //Realizar o login
                System.out.print("Digite seu cpf : ");
                s.nextLine();
                String aux_cpf = s.nextLine();

                //Caso a pessoa já tenha se cadastrado, procuramos seu cpf
                if (cpf_array.contains(aux_cpf)) {  //Encontrado o cpf, pedimos a senha
                    System.out.print("Digite sua senha : ");
                    String senha = s.nextLine();
                    if (senha_array.contains(senha)) { //Caso a senha digitada esteja no array senha_cadastro
                        System.out.println("Acesso Liberado ");
                        break;
                    }
                    else { //Caso senha não for encontrada ou senha errada
                        System.out.println("Senha errada!!");
                    }
                } else { // Caso o número do cpf estiver errado ou não tiver sido cadastrado
                    System.out.println("CPF não encontrado !!");
                }
                }

        } while (opcao != 3);

        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    *** CarONE-M ***
                    1) Cadastrar uma viagem
                    2) Buscar por carona
                    3) Avaliar uma viagem
                    4) Sair
                    """);
            System.out.println("Selecione uma opção:");
            int opcao_menu = s.nextInt();

            switch (opcao_menu) {
                case 1:
                    System.out.println("opa quer viajar ? ");
                    break;
                case 2:
                    System.out.println("Procurando uma carona ");
                    break;
                case 3:
                    System.out.println("avalie sua viagem");
                    break;
                case 4:
                    System.out.println("Deslogando...");
                    continuar = false;
                    break;

            }

        }
    }
}
