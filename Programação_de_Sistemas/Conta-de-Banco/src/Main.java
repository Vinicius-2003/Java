import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Conta cliente = new Conta("Vinícius", 1000);
        cliente.setDeposito(1500);
        cliente.setSaque(500);
        cliente.getTotal_conta();

    }
}
