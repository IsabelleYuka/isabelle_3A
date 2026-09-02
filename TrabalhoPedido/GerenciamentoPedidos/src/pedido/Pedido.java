package pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private List<ItemPedido> itemPedido;
    private double valor_total_pedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itemPedido = new ArrayList<>();
        this.valor_total_pedido = 0;
    }

    public void adicionarItem(String nomePrato, double preco) {

        ItemPedido item = new ItemPedido(nomePrato, preco);

        itemPedido.add(item);

        valor_total_pedido += preco;
    }

    public void exibirResumo() {

        System.out.println("Número do pedido: " + numeroPedido);

        System.out.println("Itens do pedido:");

        for (ItemPedido item : itemPedido) {
            System.out.println(
                item.getNomePrato() + " - R$ " + item.getPreco()
            );
        }

        System.out.println("Valor total: R$ " + valor_total_pedido);
    }
}