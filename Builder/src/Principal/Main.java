package Principal;

import Modelo.Cliente;
import Modelo.Pedido;
import Modelo.Produto;
import Modelo.Vendedor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Vitor");
        c1.setCodigo(2);
        c1.setTelefone("123-321");
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(2);
        vendedor.setNome("Joao");
        Produto p1 = new Produto();
        p1.setNome("Caneta");
        p1.setQuantidade(23);
        p1.setValor(BigDecimal.valueOf(2));
        Produto p2 = new Produto();
        p2.setNome("Lapis");
        p2.setQuantidade(12);
        p2.setValor(BigDecimal.valueOf(1));
        Pedido pedido1 = new Pedido();
        pedido1.setNumeroDoPedido("222");
        pedido1.setCliente(c1);
        pedido1.setVendedor(vendedor);
        pedido1.setProdutos(new ArrayList<>());
        pedido1.getProdutos().add(p1);
        pedido1.getProdutos().add(p2);

        pedido1.informacoes();
    }

}