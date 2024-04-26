package associacao_de_classes;

public class Circunferencia {

    // Atributos
    private double raio;
    private Ponto centro;

    //Construtor
    public Circunferencia(Ponto centro, double raio){
        this.centro = centro;
        this.raio = raio;
    }

    //Métodos
    public boolean estaContido(Ponto p){
        double distancia = centro.distancia(p);
        return raio >= distancia;
    }
}
