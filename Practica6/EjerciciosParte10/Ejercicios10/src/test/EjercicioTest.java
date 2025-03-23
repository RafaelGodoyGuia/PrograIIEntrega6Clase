package test;
import main.Ejercicio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Stack;

public class EjercicioTest {
    @Test
    public void testSumaRecursivaPilaVacia() {
        Stack<BigDecimal> pila = new Stack<>();
        assertEquals(BigDecimal.ZERO, Ejercicio.sumaRecursivaElementosPila(pila));
    }
    @Test
    public void testSumaRecursivaUnElemento() {
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("5"));
        assertEquals(new BigDecimal("5"), Ejercicio.sumaRecursivaElementosPila(pila));
    }
    @Test
    public void testSumaRecursivaVariosElementos() {
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("2"));
        pila.push(new BigDecimal("3"));
        pila.push(new BigDecimal("5"));
        assertEquals(new BigDecimal("10"), Ejercicio.sumaRecursivaElementosPila(pila));
    }
}
