package veiuclos;

public class CarroPasseio extends Veiculo {
    public CarroPasseio(float consumoCombustivel) {
        super(consumoCombustivel);
    }

    public float calcularMediaCombustivel() throws Exception {
        if (this.combustivel.eficiencia() == 3) {
            throw new Exception("Combustivel adulterado");
        }
        return consumoCombustivel * this.combustivel.eficiencia() / 2;
    }
}
