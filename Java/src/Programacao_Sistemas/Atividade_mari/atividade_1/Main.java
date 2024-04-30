package Programacao_Sistemas.Atividade_mari.atividade_1;

public class Main {
    public static void main(String[] args) {

        //Criando objeto
        Produto p1 = new Produto();

        //Colocando os dados nas variáveis
        p1.setCodigo(1000);
        p1.setDescricao("Para cabelos longos e curtos");
        p1.setPreco(10);
        p1.setQuantidade(5);

        //Método para calcular valor novo
        double aux_1 = p1.calculaValor();
        System.out.println(aux_1);

        //Exibindo conteúdo das variáveis
        p1.exibir();

        //Criando objeto
        Produto p2 = new Produto();

        //Colocando os dados nas variáveis
        p2.setCodigo(2000);
        p2.setDescricao("Iphone XV");
        p2.setPreco(2500);
        p2.setQuantidade(3);

        //Método para calcular valor novo
        double aux_2 = p2.calculaValor();
        System.out.println(aux_2);

        //Exibindo conteúdo das variáveis
        p2.exibir();


    }
}
