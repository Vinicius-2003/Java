import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
//Criando as variáveis
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String senha;
    private Motorista motorista;
    private boolean ehCliente;



//Arrays para salvar as informações do Cliente
    ArrayList<String> nome_array = new ArrayList<>();
    ArrayList<String> senha_array = new ArrayList<>();
    ArrayList<String> endereco_array = new ArrayList<>();

    Scanner input = new Scanner(System.in);

//Construtor
    public Cliente (Motorista motorista) {
        this.nome = "";
        this.email = "";
        this.endereco = "";
        this.senha = "";
        this.telefone = "";
        this.motorista = motorista;
    }

//Salvar os dados que o Cliente colocou, no array
    public void cadastrarDados( String nome, String senha, String email, String telefone, String endereco) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        nome_array.add(nome);
        senha_array.add(senha);
    }  
//Apresentar os dados que estão nos arrays
    public void mostrarDados () {
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(email);
        System.out.println(endereco);
    }
    
//Verifica se o usuário foi cadastrado, e seu nome consta no array
    public boolean verificaNome ( String nome ) {
        return nome_array.contains(nome);
    }  
// Verifica a senha colocada pelo usuário
    public boolean verificaSenha ( String senha ) {
        return senha_array.contains(senha) ;
    }

// Verifica se o usuário é um Cliente, para mostrar o menu específico dele
///////////////////////////////////////////////////////
    public void setEhCliente( boolean verificacao ) {
        this.ehCliente = verificacao;
    }

    public boolean getEhCliente () {
        return ehCliente;
    }
///////////////////////////////////////////////////////

// Realiza as avaliações da viagem
    public void avaliarViagem () {
        System.out.print("De 1 a 5, como classificaria sua viagem? : ");
        int nota = input.nextInt();

        System.out.print("\nDeseja escrever um comentário ? ");
        input.nextLine();
        String resposta = input.nextLine();

        if (resposta.equals("sim")) {
            System.out.print("Digite seu comentário : ");
            String comentario = input.nextLine();
            motorista.avaliacao_com_comentario(nota, comentario);
        } else { 
            System.out.println("Obrigado pela sua avaliação :) ");
            motorista.avaliacao(nota);
        }
    }

// Mostrando o menu especial do Cliente
    public void menuCliente () {
        if (this.ehCliente == true) {
            boolean continuar = true;

            while (continuar) {
                System.out.println("""
                        *** CarONE-M ***
                        1) Buscar Viagem
                        2) Pedir carona
                        3) Avaliar uma viagem
                        4) Sair
                        """);

                System.out.println("Selecione uma opção:");
                int opcao_menu = input.nextInt();

                switch (opcao_menu) {
                    case 1:
                        System.out.println("opa quer viajar ? ");
                        break;
                    case 2:
                        System.out.println("Procurando uma carona ");
                        break;
                    case 3:
                        avaliarViagem();
                        break;
                    case 4:
                        System.out.println("Deslogando...\n");
                        continuar = false;
                        break;
                }
            }

        }
    }
}
