package Programacao_Sistemas.Projeto2;
import java.util.ArrayList;
import java.util.Scanner;

public class Motorista {

//Criando as variáveis
private String nome;
private String cpf;
private String email;
private String endereco;
private String telefone;
private String senha;
private boolean ehMotorista;
private int quantidadeLugares;

Scanner input = new Scanner (System.in);

//Construtor
public Motorista(String nome, String cpf, String email, String endereco, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

public Motorista () {
            this.nome = "";
            this.cpf = "";
            this.email = "";
            this.endereco = "";
            this.senha = "";
            this.telefone = "";
            this.ehMotorista = false;
            this.quantidadeLugares = 0;
        }

// Salvar dados do Motorista.
public void cadastrarDados( String nome, String cpf, String telefone, String email, String endereco,String senha ) {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.telefone = telefone;
            this.endereco = endereco;
            this.senha = senha;
        }
//Mostrar os dados que forma salvos nos Arrys
public void mostrarDados () {
            System.out.println(nome);
            System.out.println(cpf);
            System.out.println(telefone);
            System.out.println(email);
            System.out.println(endereco);
        }

//Getters
public String getNome() {
        return nome;
    }
public String getCpf() {
            return cpf;
    }
public String getEmail() {
        return email;
    }
public String getEndereco() {
        return endereco;
    }
public String getTelefone() {
        return telefone;
    }
public String getSenha() {
        return senha;
    }
public boolean getEhMotorista() {
        return ehMotorista;
    }


//Setters
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
public void setEhMotorista(boolean ehMotorista) {
        this.ehMotorista = ehMotorista;
    }

//Menu do Motorista
public void Menu () {
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
//            cadastrarViagem();
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

//public void cadastrarViagem (int quantidadeLugares, String local_partida, String destino) {
//    this.quantidadeLugares = quantidadeLugares;
//    this.local_partida = local_partida;
//    this.destino = destino;
//}

}

