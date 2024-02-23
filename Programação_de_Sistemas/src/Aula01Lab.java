import java.util.Scanner;

public class Aula01Lab {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Idade : ");
        int idade = s.nextInt();

        s.nextLine();

        System.out.print("Nome : ");
        String nome = s.nextLine();

        System.out.print("Altura : ");
        float altura = s.nextFloat();

        System.out.printf("Usuário %s têm %d anos e %.2f de altura", nome, idade, altura);
    }
}
// Em Java para representar números float, usamos a "," para separar os números e não "." se não da erro.
