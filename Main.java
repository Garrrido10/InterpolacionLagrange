public class Main {
    public static void main(String[] args) {
        // 1. Definir los nodos de prueba (x) y sus valores correspondientes (y)
        // Usamos como ejemplo f(x) = x^2
        double[] x = {1.0, 2.0, 4.0};
        double[] y = {1.0, 4.0, 16.0};

        // Punto que deseamos evaluar
        double xEval = 3.0;

        System.out.print("Nodos X: ");
        imprimirArreglo(x);

        System.out.print("Valores Y: ");
        imprimirArreglo(y);

        System.out.println("Punto de evaluación (xEval): " + xEval);
        System.out.println("--------------------------------------------------\n");

        // 2. Ejecutar la Interpolación de Lagrange
        try {
            double resultadoLagrange = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);
            System.out.println("RESULTADO - Interpolación de Lagrange:");
            System.out.println("P(" + xEval + ") = " + resultadoLagrange);
        } catch (Exception e) {
            System.err.println("Error en Lagrange: " + e.getMessage());
        }
    }

    private static void imprimirArreglo(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
