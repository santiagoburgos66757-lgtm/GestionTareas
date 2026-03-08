// Parte 1:

// Fragmento 1
// Complejidad: O(n)

// Justificación: El ciclo 'for' revisa la lista de elementos una sola vez de principio a fin.


public static int encontrarMaximo(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

// Fragmento 2
// Complejidad: O(√n)

// Justificación: nos podemos fijar que el 'for' no llega hasta 'n', sino que se detiene en la raíz
// cuadrada de 'n' (Math.sqrt). Por eso este asume esa complejidad y no revisa todos los números.

public static boolean esPrimo(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

// Fragmento 3
// Complejidad:O(n X m)

// Justificación: Como hay un ciclo dentro de otro, las operaciones se multiplican.
// El primer ciclo pasa por cada fila (N) y el de adentro pasa por cada columna
//de esa fila (M). Pongo que es N * M y no N^2 porque la matriz podría ser un
// rectángulo (por ejemplo de 3x5) y no un cuadrado perfecto, así que lo más
// exacto es multiplicar la cantidad de filas por la de columnas.

public static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}

// Fragmento 4
// Complejidad: O(log n)

// Justificación: Es mejor de esta forma porque no busca elemento por elemento. Como divide el
// arreglo a la mitad en cada ciclo 'while' (descartando la otra mitad), el número de
// operaciones se reduce, creciendo en forma de logaritmo.

public static int busquedaBinaria(int[] array, int objetivo) {
    int izq = 0, der = array.length - 1;
    while (izq <= der) {
        int medio = izq + (der - izq) / 2;
        if (array[medio] == objetivo) return medio;
        if (array[medio] < objetivo) izq = medio + 1;
        else der = medio - 1;
    }
    return -1;
}

void main() {
}

