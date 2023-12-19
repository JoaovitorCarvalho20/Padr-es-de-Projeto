class VeiculoBuilder implements Veiculo {
    private VeiculoParte motor;
    private VeiculoParte rodas;
    private VeiculoParte chassi;

    public VeiculoBuilder() {
        this.motor = new Motor();
        this.rodas = new Rodas();
        this.chassi = new Chassi();
    }

    public VeiculoBuilder setMotor(VeiculoParte motor) {
        this.motor = motor;
        return this;
    }

    public VeiculoBuilder setRodas(VeiculoParte rodas) {
        this.rodas = rodas;
        return this;
    }

    public VeiculoBuilder setChassi(VeiculoParte chassi) {
        this.chassi = chassi;
        return this;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Veículo construído com as seguintes partes:");
        System.out.println("Motor: " + motor.getDescricao());
        System.out.println("Rodas: " + rodas.getDescricao());
        System.out.println("Chassi: " + chassi.getDescricao());
    }
}