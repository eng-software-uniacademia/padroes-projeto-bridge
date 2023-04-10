import combustiveis.Diesel;
import combustiveis.Etanol;
import combustiveis.Gasolina;
import org.junit.jupiter.api.Test;
import veiuclos.Caminhao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CaminhaoTest {
    @Test
    void deveRetornarConsumoDiesel() throws Exception {
        var diesel = new Diesel();
        var caminhao = new Caminhao(6);
        caminhao.setCombustivel(diesel);
        caminhao.setNumeroEixos(2);
        assertEquals(5f, caminhao.calcularMediaCombustivel(), 0.01f);
    }

    @Test
    void deveRetornarConsumoGasolina() throws Exception {
        try {
            var gasolina = new Gasolina();
            var caminhao = new Caminhao(6);
            caminhao.setCombustivel(gasolina);
            caminhao.setNumeroEixos(3);
            caminhao.calcularMediaCombustivel();
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Combustivel adulterado");
        }
    }

    @Test
    void deveRetornarConsumoEtanol() throws Exception {
        try {
            var etanol = new Etanol();
            var caminhao = new Caminhao(6);
            caminhao.setCombustivel(etanol);
            caminhao.setNumeroEixos(3);
            caminhao.calcularMediaCombustivel();
            fail();
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Combustivel adulterado");
        }
    }
}
