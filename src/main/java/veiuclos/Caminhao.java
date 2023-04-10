package veiuclos;

public class Caminhao extends Veiculo {

    private int numeroEixos;

    public Caminhao(float consumoCombustivel) {
        super(consumoCombustivel);
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public float calcularMediaCombustivel() throws Exception {
        if (this.combustivel.eficiencia() != 3) {
            throw new Exception("Combustivel adulterado");
        }
        return (consumoCombustivel / this.combustivel.eficiencia() / this.numeroEixos / 2) * 10;
    }
}
