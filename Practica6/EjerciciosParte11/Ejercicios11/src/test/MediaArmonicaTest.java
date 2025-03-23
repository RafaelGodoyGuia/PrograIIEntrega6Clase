package test;
import main.MediaArmonica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MediaArmonicaTest {
    @Test
    public void testListaVacia() {
        List<Double> datos = Collections.emptyList();
        assertThrows(ArithmeticException.class, () -> MediaArmonica.mediaArmonica(datos));
    }

    @Test
    public void testContieneCero() {
        List<Double> datos = Arrays.asList(2.0, 0.0, 4.0);
        assertThrows(ArithmeticException.class, () -> MediaArmonica.mediaArmonica(datos));
    }

    @Test
    public void testMediaArmonicaCorrecta() {
        List<Double> datos = Arrays.asList(1.0, 2.0, 4.0);
        assertEquals(1.714, MediaArmonica.mediaArmonica(datos), 0.001);
    }
}
