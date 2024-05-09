import java.util.ArrayList;

public class Motorista {
    private String nome;
    private String email;
    private String endereco;
    private int telefone;
    private String senha;

    ArrayList<String> nome_array = new ArrayList<>();
    ArrayList<String> senha_array = new ArrayList<>();
    ArrayList<String> endereco_array = new ArrayList<>();

    public Motorista () {
        this.nome = "";
        this.email = "";
        this.endereco = "";
        this.senha = "";
        this.telefone = 0;
    }

    public void cadastrarDados( String nome, String senha ) {
        this.nome = nome;
        this.senha = senha;
        nome_array.add(nome);
        senha_array.add(senha);
    }  
    
    public void mostrarNome () {
        System.out.println(nome_array.get(0));
    }

    public boolean verificaNome ( String nome ) {
        return nome_array.contains(nome);
    }  
    
    public boolean verificaSenha ( String senha ) {
        return senha_array.contains(senha) ;
    }




    public void menu () {
        System.out.println("""
                -=-=-=-=-=-=-=-=-=-== Menu ==-=-=-=-=-=-=-=-=-=-
                1 - Cadastrar Viagem
                2 - Consultar passageiros
                3 - Verificar média de avaliações
                4 - Comentários 
                5 - Sair
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                """);
    }

}
