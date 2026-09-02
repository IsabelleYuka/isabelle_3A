package pedido;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(101);

        pedido.adicionarItem("Hambúrguer", 25.00);
        pedido.adicionarItem("Batata Frita", 10.00);
        pedido.adicionarItem("Refrigerante", 7.00);

        pedido.exibirResumo();
    }
}