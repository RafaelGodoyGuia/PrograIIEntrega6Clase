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
