public class classeDaThread extends Thread {
    private int [] vetor_thread;
    private int inicio;
    private int fim;

    public classeDaThread(int [] vetor_thread, int inicio, int fim){
        this.vetor_thread = vetor_thread;
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run() {
        int soma_parcial = 0 ;
        for(int i = inicio; i <= fim; i++){
            soma_parcial += vetor_thread[i];
        }
        System.out.printf("\nSoma parcial da Thread : %d",soma_parcial);
    }
}
