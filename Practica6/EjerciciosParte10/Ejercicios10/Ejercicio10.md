# Ejercicio 58 
## Una forma de aproximar la función e^x es mediante polinomios de Taylordonde x es el valor del exponente para el que se desea realizar la aproxi mación, y n el número de sumandos que se desea calcular.
### Se pide:
### 1. Implementar un método iterativo a partir de la aproximación anterior para n = 10 utilizando la técnica de desarrollo dirigido por pruebas (TDD). No se considerará válida ninguna solución en que se obtenga el método sin haber aplicado correctamente TDD
### 2. Implementar un método recursivo a partir de la aproximación anterior. No es necesario que aplique TDD. En lo referente al tratamiento de n, se considerará válida la solución tanto si se deja variable como si se fija n =10.
### 3. ¿Cuál es la relación entre la exactitud de la aproximación implementada en Java y el valor de n? Razone la respuesta.

1. Implementación Iterativa con TDD
<br> Escribiremos una prueba sin el codigo (tiene que dar fallida)<br>
![58-1.png](Imagenes%2F58-1.png)
![58-2.png](Imagenes%2F58-2.png)
<br><br> Implementaremos el codigo minimo para que pase la prueba creada <br>
![58-3.png](Imagenes%2F58-3.png)
![58-4.png](Imagenes%2F58-4.png)


2. Implementación recursiva
<br> Codigo usando recursividad <br>
![58-5.png](Imagenes%2F58-5.png)
<br> Test para comprobar el correcto funcionamiento del codigo 
![58-6.png](Imagenes%2F58-6.png)
![58-7.png](Imagenes%2F58-7.png)


3. Relación entre la exactitud de la aproximación y el valor de n
<br> La precision de aproximacion de e^x usando la serie de Tailor aumenta conforme n crece
<br> La serie de Taylor es una expansión infinita, por lo que los primeros términos dan una aproximación y los términos adicionales mejoran la precisión.
<br> Para valores bajos de n, los términos más significativos son considerados, pero los términos más pequeños se omiten.
<br> A mayor n, menor error ya que se incluyen más términos de la serie


# Ejercicio 59
## El siguiente código calcula la suma de los elementos de una pila de big decimals:
```
package ejercicios;
import java.math.BigDecimal;
import java.util.Stack;
public class Ejercicio {
static public BigDecimal sumaIterativaElementosPila(Stack pila)
{
BigDecimal suma = BigDecimal.ZERO;
while(!pila.empty())
{
//pila.peek() devuelve la cima de la pila.
suma = suma.add((BigDecimal) pila.peek());
pila.pop();
}
return suma;
}
}
```
## Se pretende codificar, de acuerdo con la técnica de desarrollo dirigido por pruebas (TDD), el método static public BigDecimal sumaRecursivaElemen tosPila(Stack pila) de tal forma que realice la misma función que el anterior, pero de manera recursiva.
### Se pide:
### 1. La secuencia de tests y de versiones del método a desarrollar según TDD que culmine con el método implementado que pase todos los tests. En la respuesta del estudiante debe quedar claro qué versión del software hace pasar cada test.
### 2. El análisis de la complejidad temporal asintótica tanto del método dado en el enunciado como del método que sea la versión final del estudiante.
1. La secuencia de tests y de versiones del método
<br> Clase Ejercicio
```
package main;
import java.math.BigDecimal;
import java.util.Stack;

public class Ejercicio {
        public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
            
    }
}
```

<br> Escribir el test

```
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
}
```
![59-1.png](Imagenes%2F59-1.png)
<br> Implementar la version mas simple

```
package main;
import java.math.BigDecimal;
import java.util.Stack;

public class Ejercicio {
        public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
            if (pila.isEmpty()) {
                return BigDecimal.ZERO; // Caso base
            }
            return BigDecimal.ZERO; // Placeholder
    }
}
```
![59-2.png](Imagenes%2F59-2.png)
<br> Escribir un nuevo test para una pila con un solo elemento
```
 @Test
    public void testSumaRecursivaUnElemento() {
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("5"));
        assertEquals(new BigDecimal("5"), Ejercicio.sumaRecursivaElementosPila(pila));
    }
```
![59-3.png](Imagenes%2F59-3.png)
<br> Modificar la implementación para que pase el nuevo test
```
package main;
import java.math.BigDecimal;
import java.util.Stack;

public class Ejercicio {
    public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
        if (pila.isEmpty()) {
            return BigDecimal.ZERO;
        }
        return pila.pop(); // Retorna el único elemento si hay uno
    }
}
```
![59-4.png](Imagenes%2F59-4.png)
<br> Test para multiples elementos
```
 @Test
    public void testSumaRecursivaVariosElementos() {
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("2"));
        pila.push(new BigDecimal("3"));
        pila.push(new BigDecimal("5"));
        assertEquals(new BigDecimal("10"), Ejercicio.sumaRecursivaElementosPila(pila));
    }
```
![59-5.png](Imagenes%2F59-5.png)
<br> Implementación final de la versión recursiva
```
package main;
import java.math.BigDecimal;
import java.util.Stack;

public class Ejercicio {
    public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
        if (pila.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal top = pila.pop();
        BigDecimal sumaResto = sumaRecursivaElementosPila(pila);
        pila.push(top); // Restauramos el elemento eliminado
        return top.add(sumaResto);
    }
}
```
![59-6.png](Imagenes%2F59-6.png)


2. Complejidad temporal asintótica
<br> Usando el código dado por el ejercicio (método iterativo) y analizando su complejidad. Vemos que es una complejidad O(n) 
<br> Usando el código realizado por nosotros de forma recursiva y analizando su complejidad. Vemos que es una complejidad O(n) también 
