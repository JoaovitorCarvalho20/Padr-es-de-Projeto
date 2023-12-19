class CarroFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new VeiculoBuilder()
                .setMotor(new Motor())
                .setRodas(new Rodas())
                .setChassi(new Chassi());

    }
}







