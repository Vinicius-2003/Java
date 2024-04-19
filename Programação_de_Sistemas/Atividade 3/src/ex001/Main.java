
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Conta conta1 = new Conta("Vinícius", 10056, 50);
        System.out.println("Digite o valor a ser depositado : ");
        float aux_depo = conta1.depositar(s.nextFloat());
        System.out.printf("Saldo final : %.2f", aux_depo);

        System.out.println("\nDigite o valor a ser sacado : ");
        float aux_saque = conta1.sacar(s.nextFloat());
        System.out.printf("Saldo final : %.2f", aux_saque);
        

    }
}
