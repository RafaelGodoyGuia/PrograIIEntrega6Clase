package main;
import java.math.BigDecimal;
import java.util.Stack;

public class Ejercicio {
    public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
        BigDecimal suma = BigDecimal.ZERO;
        while (!pila.empty()) {
            //pila.peek() devuelve la cima de la pila.
            suma = suma.add((BigDecimal) pila.peek());
            pila.pop();
        }
        return suma;
    }
    /* Metodo recursivo
    public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
        if (pila.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal top = pila.pop();
        BigDecimal sumaResto = sumaRecursivaElementosPila(pila);
        pila.push(top); // Restauramos el elemento eliminado
        return top.add(sumaResto);
    }
     */
}
