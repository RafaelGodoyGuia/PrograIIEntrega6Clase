# Ejercicio 60
## La media armónica de una serie de datos x1,x2,...,xn viene  definida por la imagen
![60-1.png](Imagenes%2F60-1.png)
### Se pide:
### 1. Implementar mediante expresiones lambda un método para calcular la media armónica de un conjunto de datos dados en una lista utilizando la técnica de desarrollo dirigido por pruebas (TDD). La cabecera del método será la siguiente:  
### - double mediaArmonica(List<Double> datos)
### Debe tener en cuenta que se debe elevar una excepción ArithmeticException si la lista cumple alguna de las siguientes propiedades:
### a) está vacía;
### b) contiene algún elemento que sea cero; o
### c) la suma de sus inversos es cero.
### 2. Calcular la complejidad asintótica temporal del algoritmo que se muestra a continuación. Su pseudocódigo sólo es válido para conjuntos de datos no vacíos que no contienen el cero ni valores pŕoximos a cero, y tal que la suma de sus inversos tampoco es cero. 
```
function MediaArmónica(datos)
   suma ←0
   for dato in datos do
   suma ←suma+1/dato
   end for
   return datos.length/suma
   end function
```
<br> 1. Test

```
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
```
![60-2.png](Imagenes%2F60-2.png)
<br> 2. Implementación inicial del método con lambda
```
package main;

import java.util.List;

public class MediaArmonica {
    public static double mediaArmonica(List<Double> datos) {
        if (datos.isEmpty() || datos.contains(0.0)) {
            throw new ArithmeticException("Lista vacía o contiene cero");
        }

        double sumaInversos = datos.stream()
                .mapToDouble(x -> 1.0 / x)
                .sum();

        if (sumaInversos == 0) {
            throw new ArithmeticException("La suma de los inversos es cero");
        }

        return datos.size() / sumaInversos;
    }
}

```
![60-3.png](Imagenes%2F60-3.png)
<br> Tipo de complejidad: O(n) 
