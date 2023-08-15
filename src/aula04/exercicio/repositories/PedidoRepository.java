package aula04.exercicio.repositories;

import aula04.exercicio.entities.Pedido;

import java.util.ArrayList;

public class PedidoRepository {
    public ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido add(Pedido pedido){
        pedidos.add(pedido);
        return pedido;
    }


    public void rmv(Pedido pedido){
        pedidos.remove(pedido);
    }


    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Pedido> getPedidosByRestaurante(int restauranteId){
        ArrayList<Pedido> pedidosRestaurante = new ArrayList<>();
        for (Pedido pedido: pedidos) {
            if(pedido.getRestauranteId() == restauranteId){
                pedidosRestaurante.add(pedido);
            }

        }

        return pedidosRestaurante;
    }


}
