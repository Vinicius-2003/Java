package associacao_de_classes;

public class Main {
    public static void main(String[] args) {

        Ponto centro = new Ponto(3 , 5);  //define as coordenadas do centro
        Circunferencia c = new Circunferencia(centro, 7);  // define o raio sendo 7 e o centro sendo (3 , 5)
        Ponto p = new Ponto (6 , 1); //define um ponto para verificar se está dentro da circunferência ou não
        boolean contido = c.estaContido(p);
        System.out.println(contido);
    }
}
