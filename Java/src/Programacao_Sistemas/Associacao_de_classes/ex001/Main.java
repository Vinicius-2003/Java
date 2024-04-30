package Programacao_Sistemas.Associacao_de_classes.ex001;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Stephen King", new Livro("Conto de Fadas", 2023));

        String aux = autor.resumo();
        System.out.println(aux);

    }
}
