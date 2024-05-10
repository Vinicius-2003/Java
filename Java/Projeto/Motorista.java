package Programacao_Sistemas.Projeto;

import java.util.ArrayList;

public class Motorista {
    private String nome;
    private String email;
    private String endereco;
    private int telefone;

    ArrayList<String> nome_array = new ArrayList<>();
    ArrayList<String> endereco_array = new ArrayList<>();


    //Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
        nome_array.add(this.nome);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        endereco_array.add(this.endereco);
    }

    //Mostrar conteudo dos Arrays
    public void mostrar_nome () {
        for (String nome : nome_array){
            System.out.println(nome);
        }
    }

    public void mostrar_endereco () {
        for (String endereco : endereco_array){
            System.out.println(endereco);
        }
    }
}
