package Programacao_Sistemas.Atividade_4;

public class Main {
    public static void main(String[] args) {

        Pedido p1 = new Pedido(101,"Vinícius","Roupa de corrida");
        p1.setValor_pedido(1000);
        p1.valorImposto(10);

        System.out.printf("Código do pedido : %d \n",p1.getCodigo_pedido());
        System.out.printf("Valor final do pedido : %.2f R$",p1.getValor_pedido());
    }
}
