import combustiveis.Diesel;
import combustiveis.Etanol;
import combustiveis.Gasolina;
import org.junit.jupiter.api.Test;
import veiuclos.CarroPasseio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CarroPasseioTest {
    @Test
    void deveRetornarConsumoGasolina() throws Exception {
        var gasolina = new Gasolina();
        var carro = new CarroPasseio(10);
        carro.setCombustivel(gasolina);
        assertEquals(10f, carro.calcularMediaCombustivel(), 0.01f);
    }

    @Test
    void deveRetornarConsumoDiesel() throws Exception {
        try {
            var diesel = new Diesel();
            var carro = new CarroPasseio(10);
            carro.setCombustivel(diesel);
            carro.calcularMediaCombustivel();
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Combustivel adulterado");
        }
    }

    @Test
    void deveRetornarConsumoEtanol() throws Exception {
        var etanol = new Etanol();
        var carro = new CarroPasseio(5);
        carro.setCombustivel(etanol);
        assertEquals(2.5f, carro.calcularMediaCombustivel(), 0.01f);
    }
}
