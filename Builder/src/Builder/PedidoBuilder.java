package Builder;

import Modelo.Cliente;
import Modelo.Pedido;
import Modelo.Produto;
import Modelo.Vendedor;

import java.math.BigDecimal;
import java.util.ArrayList;

// Classe responsável por construir instâncias da classe Pedido de maneira flexível
public class PedidoBuilder {
    // O pedido sendo construído
    private Pedido pedido;

    // Construtor que inicializa o pedido
    public PedidoBuilder() {
        this.pedido = new Pedido();
        this.pedido.setProdutos(new ArrayList<>());
    }

    // Método para definir o cliente do pedido
    public PedidoBuilder comCliente(String nome, int codigo, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCodigo(codigo);
        cliente.setTelefone(telefone);
        this.pedido.setCliente(cliente);
        return this; // Retorna a própria instância para suportar chamadas encadeadas
    }

    // Método para definir o vendedor do pedido
    public PedidoBuilder comVendedor(int codigo, String nome) {
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(codigo);
        vendedor.setNome(nome);
        this.pedido.setVendedor(vendedor);
        return this; // Retorna a própria instância para suportar chamadas encadeadas
    }

    // Método para adicionar um produto ao pedido
    public PedidoBuilder comProduto(String nome, int quantidade, BigDecimal valor) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setValor(valor);
        this.pedido.getProdutos().add(produto);
        return this; // Retorna a própria instância para suportar chamadas encadeadas
    }

    // Método para definir o número do pedido
    public PedidoBuilder comNumeroDoPedido(String numeroDoPedido) {
        this.pedido.setNumeroDoPedido(numeroDoPedido);
        return this; // Retorna a própria instância para suportar chamadas encadeadas
    }

    // Método para finalizar a construção e obter o pedido resultante
    public Pedido construir() {
        return this.pedido;
    }
}
