public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[100];    

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        classeDaThread thread_a = new classeDaThread(vetor,0,50);
        thread_a.start();

        classeDaThread thread_b = new classeDaThread(vetor,51,99);
        thread_b.start();

        

    }
}
