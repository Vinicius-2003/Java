import java.util.ArrayList;
import java.util.Scanner;

public class Motorista {
//Criando as variáveis
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String senha;
    private boolean ehMotorista;

//Criando os arryas para armazenar as informações do Motorista
    ArrayList<String> nome_array = new ArrayList<>();
    ArrayList<String> senha_array = new ArrayList<>();
    ArrayList<String> endereco_array = new ArrayList<>();
    ArrayList<String> avaliacoes_array = new ArrayList<>();
    ArrayList<Integer> media_avaliacoes_array = new ArrayList<>();

    Scanner input = new Scanner (System.in);

//Construtor
    public Motorista () {
        this.nome = "";
        this.email = "";
        this.endereco = "";
        this.senha = "";
        this.telefone = "";
    }

// Salvar dados do Motorista.
    public void cadastrarDados( String nome, String telefone, String email, String endereco,String senha ) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.senha = senha;
        nome_array.add(nome);
        senha_array.add(senha);
    }  
//Mostrar os dados que forma salvos nos Arrys
    public void mostrarDados () {
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(email);
        System.out.println(endereco);
    }

//Verifica se o nome está dentro do Array, ou seja, vê se o usuário foi cadastrado
    public boolean verificaNome ( String nome ) {
        return nome_array.contains(nome);
    } 

//Verifica se a senha confere
    public boolean verificaSenha ( String senha ) {
        return senha_array.contains(senha) ;
    }

//Código relacionado a avaliação e comentários
///////////////////////////////////////////////////////
    public void avaliacao_com_comentario (int nota, String texto_opcional ) { 
        avaliacoes_array.add(texto_opcional);
        media_avaliacoes_array.add(nota);
    }    
    public void avaliacao (int nota ) { 
        media_avaliacoes_array.add(nota);
    }

    public void mostrarComentarios () {
        for (String comenatario : avaliacoes_array) {
            System.out.println("\n" + comenatario);
        }
    }
///////////////////////////////////////////////////////
// Verifica se quem está logado é um Motorista 
//Pois Cliente e Motorista possuem menus diferentes

public void setEhMotorista( boolean verificacao ) {
        this.ehMotorista = verificacao;
    }

    public boolean getEhMotorista () {
        return ehMotorista;
    }

//Mostrar o menu que só os Motoristas têm acesso
    public void menuMotorista () {
        System.out.println("""
                -=-=-=-=-=-=-=-=-=-== Menu ==-=-=-=-=-=-=-=-=-=-
                1 - Cadastrar Viagem
                2 - Consultar passageiros
                3 - Verificar média de avaliações
                4 - Comentários 
                5 - Sair
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-
                """);

                System.out.println("Selecione uma opção:");
                int opcao_menu = input.nextInt();

                boolean continuar = true;
                switch (opcao_menu) {
                    case 1:
                        System.out.println(" Cadastrar viagem ");
                        break;
                    case 2:
                        System.out.println("Quem são seus passageiros ");
                        break;
                    case 3:
                        System.out.println("Consultar avaliação e comentários ");
                        break;
                    case 4:
                        System.out.println("Deslogando...");
                        continuar = false;
                        break;
                }
            }
///////////////////////////////////////////////////////
}
