import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        char vogal;
        int contadorVogal = 0;

        System.out.print("Digite uma frase : ");
        frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            vogal = frase.charAt(i);
            if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
                contadorVogal++;
            }
        }
        System.out.printf("Essa frase têm %d vogais",contadorVogal);
        entrada.close();
    }
}
