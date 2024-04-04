package ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Elevador elevador1 = new Elevador(3, 2);
        elevador1.Entrar();
        elevador1.Entrar();
        elevador1.Entrar();
        elevador1.Sair();
        elevador1.Subir();
        elevador1.Subir();
        elevador1.Subir();
        elevador1.Descer();
        elevador1.Descer();
        elevador1.Descer();
        elevador1.Sair();
        elevador1.Sair();
        elevador1.Sair();
    }
}
