import java.util.Scanner;

public class ex02 {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;
        System.out.print("Valor 1 : ");
        valor1 = s.nextInt();
        
        System.out.print("Valor 2 : ");
        valor2 = s.nextInt();
        resultado = soma(valor1, valor2);
        System.out.printf("Soma de %d com %d é %d",valor1,valor2,resultado);
        s.close();
    }
}
