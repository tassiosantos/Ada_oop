package aula04.exercicio.services;

import aula04.exercicio.entities.Cliente;
import aula04.exercicio.repositories.ClienteRespository;

public class ClienteService {
    public static ClienteRespository clienteRespository;

    public ClienteService(){clienteRespository = new ClienteRespository();}

    public Cliente adicionarCliente(String nome, String contato){
        return clienteRespository.add(new Cliente(nome, contato));
    }

    public void removerCliente(Cliente cliente){
        clienteRespository.rmv(cliente);
    }
}
