package aula04.exercicio.repositories;

import aula04.exercicio.entities.Cliente;

import java.util.ArrayList;

public class ClienteRespository {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente add(Cliente cliente){
        this.clientes.add(cliente);
        return cliente;
    }

    public void rmv(Cliente cliente){
        this.clientes.remove(cliente);
    }



}
