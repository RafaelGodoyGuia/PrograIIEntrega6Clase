package test;
import main.AproximacionExponencial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AproximacionExponencialTest {

    @Test
    public void testExponencialAproximacionIterativa() {
        assertEquals(Math.exp(1), AproximacionExponencial.expTaylorIterativo(1, 10), 0.0001);
        assertEquals(Math.exp(0), AproximacionExponencial.expTaylorIterativo(0, 10), 0.0001);
        assertEquals(Math.exp(-1), AproximacionExponencial.expTaylorIterativo(-1, 10), 0.0001);
        assertEquals(Math.exp(2), AproximacionExponencial.expTaylorIterativo(2, 10), 0.0001);
    }
    @Test
    public void testExponencialAproximacionRecursiva() {
        assertEquals(Math.exp(1), AproximacionExponencial.expTaylorRecursivo(1, 10), 0.0001);
    }
}
