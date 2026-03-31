package ut2.act1;

/**
 * Clase que rellena las columnas del array
 * Implementa Runnable para poder ejecutar las tareas escritas en el run() por hilos
 */
public class RellenarColumna implements Runnable {
    int[][] array;
    int indice;

    /**
     * Contstructor de la clase.
     * Pide cómo parámetros un array y un entero (int)

     * @param array
     * Es el array que tiene que ser rellenado por los distintos hilos del programa
     * @param indice
     * Es el numero de columna que debera rellenar
     */
    public RellenarColumna(int[][] array, int indice) {
        this.array = array;
        this.indice = indice;
    }

    /**
     * Función que es ejecutada por el hilo (thread)
     */
    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i][indice] = indice;
        }
    }
}
