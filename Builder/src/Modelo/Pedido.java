package Modelo;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;

// Classe que representa um pedido de produtos
public class Pedido {
    private String numeroDoPedido;
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    // Método getter para obter a lista de produtos
    public List<Produto> getProdutos() {
        return produtos;
    }

    // Método setter para definir a lista de produtos
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    // Método getter para obter o cliente do pedido
    public Cliente getCliente() {
        return cliente;
    }

    // Método getter para obter o vendedor do pedido
    public Vendedor getVendedor() {
        return vendedor;
    }

    // Método setter para definir o vendedor do pedido
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    // Método para calcular e obter o valor total do pedido
    public BigDecimal getValorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
        }
        return total;
    }

    // Método para obter o total de produtos no pedido
    public int getTotalProdutos() {
        int total = 0;
        for (Produto produto : produtos) {
            total += produto.getQuantidade();
        }
        return total;
    }

    // Método getter para obter o número do pedido
    public String getNumeroDoPedido() {
        return numeroDoPedido;
    }

    // Método setter para definir o número do pedido
    public void setNumeroDoPedido(String numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    // Método para exibir as informações do pedido em uma janela de diálogo
    public void informacoes() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Número do Pedido: ").append(numeroDoPedido).append("\n");
        mensagem.append("Cliente: ").append(cliente.getNome()).append("\n");
        mensagem.append("Vendedor: ").append(vendedor.getNome()).append("\n");
        mensagem.append("Produtos:\n");

        for (Produto produto : produtos) {
            mensagem.append("- ").append(produto.getNome()).append(": ")
                    .append(produto.getQuantidade()).append(" unidades\n");
        }

        mensagem.append("\nTotal de Produtos: ").append(getTotalProdutos()).append("\n");
        mensagem.append("Valor Total: R$").append(getValorTotal()).append("\n");

        // Exibe as informações em uma janela de diálogo
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Informações do Pedido", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método setter para definir o cliente do pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
