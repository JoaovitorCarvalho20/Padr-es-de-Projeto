public class Main {
    public static void main(String[] args) {
// Usando o Factory Method para criar um carro
        VeiculoFactory carroFactory = new CarroFactory();
        Veiculo carro = carroFactory.criarVeiculo();

        // Exibindo as informações do veículo
        carro.exibirInfo();
    }
}