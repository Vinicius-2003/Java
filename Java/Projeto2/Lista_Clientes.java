package Programacao_Sistemas.Projeto2;

import java.util.ArrayList;

public class Lista_Clientes {
    private Cliente cliente = new Cliente();
    ArrayList<Cliente> lista = new ArrayList();

     public Lista_Clientes (Cliente cliente) {
         this.cliente = cliente;
     }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarCliente (Cliente cliente) {
        lista.add(cliente);
    }


    public void mostrarLista () {
        for (Cliente dados : lista) {
            System.out.println(dados.getNome());
            System.out.println(dados.getEmail());
            System.out.println(dados.getEndereco());
        }
    }

}

