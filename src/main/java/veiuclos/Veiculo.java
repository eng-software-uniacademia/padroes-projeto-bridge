package veiuclos;

import combustiveis.Combustivel;

public abstract class Veiculo {
    protected Combustivel combustivel;

    protected float consumoCombustivel;

    public Veiculo(float consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void setConsumoCombustivel(float consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public abstract float calcularMediaCombustivel() throws Exception;
}
