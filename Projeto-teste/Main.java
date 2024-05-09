
// import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Cores
    public static final String ANSI_GREEN = "\u001B[37m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        Motorista motorista = new Motorista();
        Cliente cliente = new Cliente(motorista);
        Menu menu = new Menu(motorista, cliente);

        menu.mostrarMenu();

        
    }
}
