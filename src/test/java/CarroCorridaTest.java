import combustiveis.Diesel;
import combustiveis.Etanol;
import combustiveis.Gasolina;
import org.junit.jupiter.api.Test;
import veiuclos.CarroCorrida;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CarroCorridaTest {
    @Test
    void deveRetornarConsumoGasolina() throws Exception {
        try {
            var gasolina = new Gasolina();
            var carro = new CarroCorrida(10);
            carro.setCombustivel(gasolina);
            carro.calcularMediaCombustivel();
            fail();
        } catch (Exception ex)
        {
            assertEquals(ex.getMessage(), "Combustivel adulterado");
        }
    }

    @Test
    void deveRetornarConsumoDiesel() throws Exception {
        try {
            var diesel = new Diesel();
            var carro = new CarroCorrida(10);
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
        var carro = new CarroCorrida(3);
        carro.setCombustivel(etanol);
        assertEquals(3f, carro.calcularMediaCombustivel(), 0.01f);
    }
}
