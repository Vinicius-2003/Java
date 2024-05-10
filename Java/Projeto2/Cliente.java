package Programacao_Sistemas.Projeto2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    //Criando as variáveis
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String telefone;
    private String senha;
    private Motorista motorista;
    private boolean ehCliente;

    Scanner input = new Scanner(System.in);

    //Construtor
    public Cliente(String nome, String cpf, String email, String endereco, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }
    public Cliente(Motorista motorista) {
        this.nome = "";
        this.cpf = "";
        this.email = "";
        this.endereco = "";
        this.senha = "";
        this.telefone = "";
        this.motorista = motorista;
        this.ehCliente = false;
    }

    public Cliente() {
        this.nome = "";
        this.email = "";
        this.endereco = "";
        this.senha = "";
        this.telefone = "";
    }

    //Salvar os dados que o Cliente colocou, no array
    public void cadastrarDados( String nome, String cpf, String senha, String email, String telefone, String endereco ) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //Apresentar os dados que estão nos arrays
    public void mostrarDados() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(telefone);
        System.out.println(email);
        System.out.println(endereco);
        System.out.println(senha);
    }

    //GETTERS
    public String getNome () {
        return nome;
    }
    public String getCpf () {
        return cpf;
    }
    public String getEmail () {
        return email;
    }
    public String getEndereco () {
        return endereco;
    }
    public String getTelefone () { return telefone; }
    public String getSenha () {
        return senha;
    }
    public boolean getEhCliente () { return ehCliente; }

    //SETTERS
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }
    public void setSenha (String senha) {
        this.senha = senha;
    }
    public void setEhCliente(boolean ehCliente) {
        this.ehCliente = ehCliente;
    }


    //Menu do Cliente

    public void Menu () {
        int opcao = 0;
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
                    break;
                case 4:
                    System.out.println("Deslogando...\n");
                    continuar = false;
                    break;
            }
        }
    }


}

