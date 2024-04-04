package ex002;

public class Elevador {
    public int total_pessoas;
    public int total_andares;
    public int capacidade_pessoas;
    public int andar_atual;

    public Elevador(int capacidade_pessoas, int total_andares){
        this.andar_atual = 0;
        this.total_pessoas = 0;
        this.capacidade_pessoas = capacidade_pessoas;
        this.total_andares = total_andares;
    }
    public void Entrar(){
        if (total_pessoas < capacidade_pessoas){
            total_pessoas++;
            System.out.println("Uma pessoa entrou!");
        }else{
            System.out.println("Elevador está lotado :/");
        }
    }
    public void Sair(){
        if (total_pessoas == 0){
            System.out.println("Não há ninguém no elevador");
        }else{
            total_pessoas--;
            System.out.println("Uma pessoa saiu do elevador.");
        }
    }
    public void Subir(){
        if(andar_atual == total_andares){
            System.out.println("Elevador já está no último andar");
        }else{
            andar_atual++;
            System.out.println("Elevador subiu um andar");
        }
    }
    public void Descer(){
        if(andar_atual == 0){
            System.out.println("Elevador está no Térreo");
        }else{
            andar_atual--;
            System.out.println("Elevador desceu um andar");
        }
    }

}
