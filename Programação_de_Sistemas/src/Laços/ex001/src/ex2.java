package ex001.src;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segundos_entrada;

        System.out.println("Informe a quantidade de segundos : ");
        segundos_entrada = entrada.nextInt();

        int horas = (segundos_entrada / 3600);
        int minutos = (segundos_entrada % 3600) / 60;
        int segundos = (segundos_entrada % 3600) % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);
        entrada.close();
    }
}
