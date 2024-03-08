package Programação_de_Sistemas;

import java.util.Scanner;

public class Conversor_temperatura {
    public static float conversor_fahrenheit(float celsius) {
        float f = ((9 * celsius) / 5) + 32;
        return f;
    }

    public static float conversor_celsius(float fahrenheit) {
        float c = (5 * (fahrenheit - 32)) / 9;
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("Entrar com Celsius (1)/ Entrar com Fahrenheit (2) : ");
        int escolha = s.nextInt();
        if (escolha == 1) {
            System.out.print("Temperatura em Celsius : ");
            celsius = s.nextFloat();
            float resultado_fahrenheit = conversor_fahrenheit(celsius);
            System.out.printf("%.2f celsius é %.2f Fahrenheit!", celsius, resultado_fahrenheit);
        } else if (escolha == 2) {
            System.out.print("Temperatura em Fahrenheit : ");
            fahrenheit = s.nextFloat();
            float resultado_celsius = conversor_celsius(fahrenheit);
            System.out.printf("%.2f Fahrenheit é %.2f graus!",fahrenheit,resultado_celsius);
        }
        s.close();
    }

}
