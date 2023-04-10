package veiuclos;

public class CarroCorrida extends Veiculo {
    public CarroCorrida(float consumoCombustivel) {
        super(consumoCombustivel);
    }

    @Override
    public float calcularMediaCombustivel() throws Exception {
        if (this.combustivel.eficiencia() != 1) {
            throw new Exception("Combustivel adulterado");
        }
        return consumoCombustivel / this.combustivel.eficiencia();
    }
}
