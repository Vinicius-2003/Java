package ex001.src;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count = 1;
        System.out.print("Números múltiplos de 3: ");
        while(count<100){
            if(count%3==0){
                System.out.printf("%d,  ",count);
            }
            count++;
        }
        count = 1;
        System.out.println();
        System.out.print("Números múltiplos de 5: ");
        while(count<100){
            if(count%5==0){
                System.out.printf("%d,  ",count);
            }
            count++;
        }
        count = 1;
        System.out.println();
        System.out.print("Números múltiplos de 3 e 5: ");
        while(count < 100){
            if(count%3==0 && count%5==0){
                System.out.printf("%d,  ",count);
            }
            count++;
        }
        entrada.close();
    }
}
