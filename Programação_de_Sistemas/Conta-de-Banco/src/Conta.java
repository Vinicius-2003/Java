public class Conta {
    private String nome;
    private double total_conta;
    private double deposito;
    //private, só quem acessa, são os métodos dentro daqui e funções! Lá na Main não tera acesso a esses atributos diretamente. 


    public Conta(String nome, double total_conta){
        this.nome = nome;
        this.total_conta = total_conta;
    }
    public double setDeposito(double valor){ //inserir valor
        return this.total_conta += valor;
    }
    public void getDeposito(){ //mostrar último saque
        System.out.printf("Depósito recente: %.2f",deposito);
    }
    public double setSaque(double valor){ //tirar valor da conta
        return this.total_conta -= valor;
    }
    public void getTotal_conta(){ //mostrar quanto há na conta
        System.out.println(total_conta);
    }
    public void getData(){
        System.out.printf("Nome do Titular : %s",nome);
        System.out.printf("Total na conta : %.2f",total_conta);
    }
}
