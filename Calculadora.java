public class Calculadora {
    private int x;
    private int y;

    public Calculadora(int x, int y) {
        this.x = x;
        this.y = y;
    }

//suma
    public int suma() {
        return x + y;
    }
//resta
    public int resta() {
        return x - y;
    }
//multiplicacion
    public int multiplicacion() {
        return x * y;
    }
//division
    public double division() {

        if (y == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        } else {
            return (double) x / y;
        }
    }

    public int modulo() {
        if (y == 0) {
            System.out.println("No se puede calcular el módulo con cero.");
            return -1;
        } else {
            return x % y;
        }
    }

    //  imprimir resultados
    public void imprimirResultados() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma: " + suma());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicacion());
        System.out.println("División: " + division());
        System.out.println("Módulo: " + modulo());
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 3);
        // Imprimir resultados
        calculadora.imprimirResultados();
    }
}
