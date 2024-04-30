package Programacao_Sistemas.Associacao_de_classes.ex001;

public class Autor {
    //Atributos
    private String nome;
    private Livro livro;

    //Construtor
    public Autor(String nome, Livro livro){
        this.nome = nome;
        this.livro = livro;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String resumo(){
        return "Livro : " + livro.getTitulo() +
                "\nAutor : " + nome +
                "\nData de publicação : " + livro.getAno();
    }
}
