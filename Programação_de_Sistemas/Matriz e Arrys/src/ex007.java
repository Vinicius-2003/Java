import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int [3][4];
        int [][] matriz_transposta = new int [4][3];

        for(int i = 1; i<3;i++){
            for(int j = 1;j<4;j++){
                System.out.printf("Valor para posição %d,%d : ",i,j);
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original : ");
        for(int i = 1; i<3;i++){
            System.out.println();
            for(int j = 1;j<4;j++){
                System.out.printf("%d   ",matriz[i][j]);
            }
        }
        for(int i = 1; i<4;i++){
            for(int j = 1; j<3;j++){
                matriz_transposta[i][j] = matriz[j][i];
            }
        }
        System.out.println("\n");
        System.out.println("\nMatriz transposta : ");
        for(int i = 1; i<4;i++){
            System.out.println();
            for(int j = 1;j<3;j++){
                System.out.printf("%d   ",matriz_transposta[i][j]);
            }
        }
        entrada.close();
    }
}
