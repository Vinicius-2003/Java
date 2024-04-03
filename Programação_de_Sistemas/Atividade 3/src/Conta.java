public class Conta {
    public String nome;
    public int num_conta;
    public float saldo;

    public Conta(String nome, int num_conta, float saldo){
        this.nome = nome;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    public float depositar(int valor){
        System.out.printf("Saldo atual : %f",saldo);
        saldo += valor;
        return saldo;
    }
}
