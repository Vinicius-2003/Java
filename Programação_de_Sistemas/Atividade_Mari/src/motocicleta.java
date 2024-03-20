public class motocicleta {
    String modelo;
    String marca;
    String nroPlaca;
    String cor;
    int nroCilindradas;
    int nroChassi;

    public motocicleta(String modelo, String marca, String nroPlaca, String cor, int nroCilindradas, int nroChassi) {
        this.modelo = "";
        this.marca = "";
        this.nroPlaca = "";
        this.cor = "";
        this.nroCilindradas = 0;
        this.nroChassi = 0;
    }

    public static String licenciar( String nroPlaca){
        int tamanho = nroPlaca.length();
        char [] vetor = new char[tamanho]; 
        for(int i =0; i<tamanho; i++){
            vetor[i] = nroPlaca.charAt(i);
        }
        int aux = vetor[vetor.length-1];
        
        switch (aux) {
            case "1";
System.out.println();
                break;
        
            default:
                break;
        }
    }
}
