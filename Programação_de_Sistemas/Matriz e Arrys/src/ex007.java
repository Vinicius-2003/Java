import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int [2][3];
        int [][] matriz_transposta = new int [3][2];

        for(int i = 1; i<3;i++){
            for(int j = 1;j<4;j++){
                System.out.printf("Valor para posição %d,%d : ",i,j);
                matriz[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i<3;i++){
            for(int j = 0;j<4;j++){
                System.out.printf("Valor : %d",matriz[i][j]);
            }
        }
        entrada.close();
    }
}
