package main;

public class AproximacionExponencial {
    //================== Iterativo ===================
    public static double expTaylorIterativo(double x, int n) {
        double suma = 1.0; // Primer término (x^0 / 0! = 1)
        double termino = 1.0; // Cada término se calcula a partir del anterior

        for (int i = 1; i <= n; i++) {
            termino *= x / i; // Calcula el término actual basado en el anterior
            suma += termino;
        }
        return suma;
    }
    //=================== Recursivo ===================
    // Método recursivo para calcular e^x
    public static double expTaylorRecursivo(double x, int n) {
        if (n == 0) {
            return 1.0; // Caso base
        }
        return expTaylorRecursivo(x, n - 1) + Math.pow(x, n) / factorial(n);
    }
    // Método auxiliar para calcular factorial
    private static double factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
