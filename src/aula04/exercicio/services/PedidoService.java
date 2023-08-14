package aula04.exercicio.services;

import aula04.exercicio.entities.Pedido;
import aula04.exercicio.entities.Prato;
import aula04.exercicio.repositories.PedidoRepository;

import java.util.ArrayList;

public class PedidoService {

    public static PedidoRepository pedidoRepository;

    public PedidoService(){pedidoRepository = new PedidoRepository();}


    public Pedido adicionarPedido(String nomeRestaurante, ArrayList<Prato> nomePratos, ArrayList<Integer> qtdPratos){
        return pedidoRepository.add(new Pedido(nomeRestaurante, nomePratos, qtdPratos));

    }


}
