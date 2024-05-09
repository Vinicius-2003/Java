package Programacao_Sistemas.Associacao_de_classes.ex001;

public class Livro {
    private String titulo;
    private int ano;

    public Livro(String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
