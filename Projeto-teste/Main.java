// import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String ANSI_GREEN = "\u001B[37m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Motorista motorista = new Motorista ();
        Cliente cliente = new Cliente ();

        int opcao;
        do {

            System.out.println("-=-=-=-=-=-Menu-=-=-=-=-=-");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Logar");
            System.out.println("3 - Sair");
            System.out.print("Opção : ");
            opcao = input.nextInt();

            if(opcao == 1){ //Cadastrar dados do cliente

                System.out.print("Cadastro de Motorista (1) ou de Cliente (2) ? :");
                int opcao_de_cadastro = input.nextInt();

                if(opcao_de_cadastro == 1) { //Cadastrar motorista

                    System.out.println("MOTORISTA");
                    System.out.println("Digite seu nome ");
                    System.out.print("Nome do Motorista : ");
                    input.nextLine();
                    String nome_motorista = input.nextLine();
    
                    System.out.println("\nCadastre sua senha");
                    System.out.print("senha : ");
                    String senha_cadastro = input.nextLine();
    
                    motorista.cadastrarDados(nome_motorista, senha_cadastro); //Guardar dados do motorista

                } else { //Cadastrar cliente

                    System.out.println("CLIENTE");

                    System.out.println("Digite seu nome ");
                    System.out.print("Nome do Cliente : ");
                    input.nextLine();
                    String nome_cliente = input.nextLine();
    
    
                    System.out.println("\nCadastre sua senha");
                    System.out.print("senha : ");
                    String senha_cadastro = input.nextLine();
    
                    cliente.cadastrarDados(nome_cliente, senha_cadastro); //Guardar dados do cliente
                }
                continue;

            }
            if(opcao == 2){ //Realizar o login
                System.out.print("Digite seu Nome : ");
                input.nextLine();
                String aux_nome = input.nextLine();

                if (motorista.verificaNome(aux_nome)) {  //verifica se o nome é de um motorista

                    System.out.print("Digite sua senha : ");
                    String senha = input.nextLine();

                    if (motorista.verificaSenha(senha)) { //Verifica a senha dentro do array senha na classe Motorista
                        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "Acesso Liberado !" + ANSI_RESET);
                        break;
                    }
                    else {
                        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "Acesso Negado !" + ANSI_RESET);
                    }
                } else if (cliente.verificaNome(aux_nome)) { //verifica se o nome é de um cliente

                    System.out.print("Digite sua senha : ");
                    String senha = input.nextLine();

                    if (cliente.verificaSenha(senha)) {  //Verifica a senha no array senha na classe Cliente
                        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "Acesso Liberado !" + ANSI_RESET);
                        break;
                    }
                    else {
                        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "Acesso Negado !" + ANSI_RESET);
                    }
                } else { //Caso a pessoa tente se logar sem se cadastrar 
                    System.out.println("É preciso se cadastrar primeiro!");
                }
                }
        } while (opcao != 3); //Sair do primeiro menu


        input.close();
    }
}



