package ex001;
public class Conta {
    public String nome;
    public int num_conta;
    public float saldo;

    public Conta(String nome, int num_conta, float saldo){
        this.nome = nome;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public float depositar(float valor){
        System.out.printf("Saldo antigo : %.2f\n",saldo);
        saldo += valor;
        return saldo;
    }
    public float sacar(float valor){
        System.out.println("Valor a ser sacado : ");
        saldo -= valor;
        return saldo;
    }
}
