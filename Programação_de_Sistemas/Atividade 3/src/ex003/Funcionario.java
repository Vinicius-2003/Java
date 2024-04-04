package ex003;

public class Funcionario {
    public String nome_funcionario;
    public String nome_departamento;
    public String rg;
    public double salario;

    
    public Funcionario(String nome_funcionario, String nome_departamento, String rg, double salario){
        this.nome_funcionario = nome_funcionario;
        this.nome_departamento = nome_departamento;
        this.rg = rg;
        this.salario = salario;
    }
    
    public void recebeAumento(int valor){
        salario = salario + ((salario*valor)/100);
        System.out.printf("Salário atual %.2f R$\n",salario);
    }
    public void calculaGanhoAnual(){
        System.out.printf("O salário anual do funcionário é de %.2f R$", salario*12);
    }
    public void exibeInformacoes(){
        System.out.println(nome_funcionario);
        System.out.println(nome_departamento);
        System.out.println(salario);
    }
}
