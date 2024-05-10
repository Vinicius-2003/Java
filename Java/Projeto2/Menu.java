package Programacao_Sistemas.Projeto2;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    //Cores
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";


    //Criando um scanner
    Scanner input = new Scanner(System.in);

    //Declaração das variáveis
    public Motorista motorista;
    public Cliente cliente;
    public boolean continuar = true;
    public int opcao;

    //Construtor
    public Menu(Motorista motorista, Cliente cliente) {
        this.motorista = motorista;
        this.cliente = cliente;
    }

    //Método para mostrar o menu na Main
    public void mostrarMenu() {
        while (continuar) {
            System.out.println(ANSI_YELLOW_BACKGROUND + "-=-=-=-=-=-Menu-=-=-=-=-=-" + ANSI_RESET);
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Logar");
            System.out.println("3 - Sair");
            System.out.print("Opção : ");
            opcao = input.nextInt();

            if (opcao == 1) { // Cadastrar dados ou do Cliente ou do Motorista

                System.out.print("Cadastro de Motorista (1) ou de Cliente (2) ? :");
                int opcao_de_cadastro = input.nextInt(); //Verifica qual será o perfil

                if (opcao_de_cadastro == 1) { // Cadastrar motorista

                    System.out.println(ANSI_PURPLE + "CADASTRO DE MOTORISTA" + ANSI_RESET);

                    System.out.print("Nome do Motorista : ");
                    input.nextLine();
                    String nome_motorista = input.nextLine();

                    System.out.print("Cpf : ");
                    String cpf_motorista = input.nextLine();

                    System.out.print("Senha : ");
                    String senha_cadastro = input.nextLine();

                    System.out.print("Email : ");
                    String email = input.nextLine();

                    System.out.print("Telefone : ");
                    String telefone = input.nextLine();

                    System.out.print("Endereço : ");
                    String endereco = input.nextLine();

                    // Guardar dados do motorista na Classe Motorista
                    motorista.cadastrarDados(nome_motorista, cpf_motorista, telefone, email, endereco, senha_cadastro);

                } else if (opcao_de_cadastro == 2) { // Cadastrar cliente

                    System.out.println(ANSI_BLUE + "CADASTRO DO CLIENTE" + ANSI_RESET);

                    System.out.print("Nome do Cliente : ");
                    input.nextLine();
                    String nome_cliente = input.nextLine();

                    System.out.print("Cpf : ");
                    String cpf_cliente = input.nextLine();

                    System.out.print("Nova senha : ");
                    String senha_cadastro = input.nextLine();

                    System.out.print("Email : ");
                    String email = input.nextLine();

                    System.out.print("Telefone : ");
                    String telefone = input.nextLine();

                    System.out.print("Endereço : ");
                    String endereco = input.nextLine();

                    cliente.cadastrarDados(nome_cliente, cpf_cliente, senha_cadastro, email, telefone, endereco); // Guardar dados do cliente
                }
                continue;

            } else if (opcao == 2) {
                System.out.print("Digite seu Cpf : ");
                input.nextLine();
                String cpf = input.nextLine();

                if (motorista.getCpf().equals(cpf)) { //Verifica se o nome consta na Classe Motorista
                    System.out.print("Digite sua senha : ");
                    String senha = input.nextLine();

                    if (motorista.getSenha().equals(senha)) { //Verifica se a senha consta na Classe Motorista
                        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "Acesso Liberado !" + ANSI_RESET); //Libera o Acesso
                        motorista.setEhMotorista(true);
                        break;
                    } else {
                        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "Acesso Negado !" + ANSI_RESET); // Acesso Negado
                    }
                } else if (cliente.getCpf().equals(cpf)) { // Verifica se o nome está na Classe Cliente
                    System.out.print("Digite sua senha : ");
                    String senha = input.nextLine();

                    if (cliente.getSenha().equals(senha)) { // Verifica a senha no array senha na classe Cliente
                        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "Acesso Liberado !" + ANSI_RESET);
                        cliente.setEhCliente(true);
                        break;
                    } else {
                        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "Acesso Negado !" + ANSI_RESET);
                    }
                } else {
                    System.out.println("É preciso se cadastrar primeiro!");
                }
            }
        }
        if (cliente.getEhCliente()){
            cliente.Menu();
        } else {
            motorista.Menu();
        }
    }
}

