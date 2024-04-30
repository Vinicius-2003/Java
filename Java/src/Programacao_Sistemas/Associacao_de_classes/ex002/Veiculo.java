package Programacao_Sistemas.Associacao_de_classes.ex002;

public class Veiculo {
    private String placa;
    private Pessoa dono;

    public Veiculo(){
        this.placa = "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void vender(Pessoa dono){
        System.out.printf("Nome do dono : %s\n",dono.getNome());
        System.out.printf("Placa do carro : %s",placa);

    }
}
