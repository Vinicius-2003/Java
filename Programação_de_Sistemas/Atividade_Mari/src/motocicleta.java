public class Motocicleta {
    String modelo;
    String marca;
    String nroPlaca;
    String cor;
    int nroCilindradas;
    int nroChassi;

    public void licenciar() {
        String placa = this.nroPlaca;
        if (placa.charAt(placa.length() - 1) == '1') {
            System.out.println("abril");
        }
        if (placa.charAt(placa.length() - 1) == '2') {
            System.out.println("maio");
        }
        if (placa.charAt(placa.length() - 1) == '3') {
            System.out.println("junho");
        }
        if (placa.charAt(placa.length() - 1) == '4') {
            System.out.println("julho");
        }
        if (placa.charAt(placa.length() - 1) == '5' || placa.charAt(placa.length() - 1) == '6') {
            System.out.println("agosto");
        }
        if (placa.charAt(placa.length() - 1) == '7') {
            System.out.println("setembro");
        }
        if (placa.charAt(placa.length() - 1) == '8') {
            System.out.println("outubro");
        }
        if (placa.charAt(placa.length() - 1) == '9') {
            System.out.println("novembro");
        }
        if (placa.charAt(placa.length() - 1) == '0') {
            System.out.println("dezembro");
        }
    }

    public boolean checaChassi(int nro) {
        int aux = this.nroChassi;
        if (nro == aux) {
            return true;
        } else {
            return false;
        }
    }
}