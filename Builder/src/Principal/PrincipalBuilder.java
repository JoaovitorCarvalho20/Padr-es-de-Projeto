package Principal;

import Builder.PedidoBuilder;
import Modelo.Pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class PrincipalBuilder {
    public  static void main(String[] args) {
        Pedido pedido1 = new PedidoBuilder()
                .comCliente("Vitor", 2, "123-321")
                .comVendedor(2, "Joao")
                .comProduto("Caneta", 23, BigDecimal.valueOf(2))
                .comProduto("Lapis", 15, BigDecimal.valueOf(1))
                .comNumeroDoPedido("222")
                .construir();

        pedido1.informacoes();

        List<String>Listateste=new Vector<>();
        Listateste.add("a");






    }

    }

    /**
     * O Builder Pattern é um padrão de projeto de criação que fornece uma maneira de construir objetos complexos passo a passo. Ele é especialmente útil quando um objeto possui muitos atributos opcionais e queremos criar instâncias desse objeto com diferentes combinações de atributos.
     * Principais componentes do Builder Pattern:
     * Product (Produto): A classe complexa que será construída. No contexto do Builder Pattern, este é o objeto que queremos criar com diferentes configurações.
     * Builder (Construtor): Interface ou classe abstrata que define os métodos para construir as partes do produto. Cada método geralmente corresponde a um atributo do produto.
     * ConcreteBuilder (Construtor Concreto): Implementação específica da interface Builder que fornece a lógica de construção do produto.
     * Director (Diretor): Responsável por orquestrar o processo de construção usando o Builder. Ele não precisa conhecer os detalhes específicos da construção.
     * Client (Cliente): Utiliza o Director para criar objetos complexos sem se preocupar com os detalhes de construção.
     * */

