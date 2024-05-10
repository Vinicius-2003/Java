import java.util.ArrayList;

public class Cofre {
    public Moeda moeda;
    ArrayList<Double> cofre = new ArrayList<>();
    

    public Cofre () {
        
    }

    public void adicionar ( Moeda moeda ) {
        cofre.add(moeda.getValor());
    }

    public double calcularTotal() {
        double soma_total = 0;
        soma_total += moeda.getValor();
        return soma_total;
    }

    public int contarMoedas(Moeda moeda){
        int total_moedas = 0;
        for (int i = 0 ; i < cofre.size(); i ++){
            if (moeda.getValor() == cofre.get(i)){
                total_moedas++;
            }
        }
    return total_moedas;
    }
}


