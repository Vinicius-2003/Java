import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        motocicleta m = new motocicleta();
        m.modelo = input.next();
        m.marca = input.next();
        m.nroChassi = input.nextInt();
        m.nroPlaca = input.next();
        m.cor = input.next();
        m.nroCilindradas = input.nextInt();
    
        m.licenciar();
        System.out.println(m.checaChassi(input.nextInt()));
        System.out.print(fichaTecnica(m));
        input.close();
    }

    static String fichaTecnica(motocicleta m) {
        return m.modelo + "\t" + m.marca + "\t" + m.nroChassi +
                "\t" + m.nroPlaca + "\t" + m.cor + "\t" + m.nroCilindradas;
    }
}