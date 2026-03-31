package ut2.act1;

public class Main {
    // Creamos el array que rellenaran los threads
    static int[][] array = new int[25][10];

    public static void main(String[] args) {
        // Creamos un array de 10 hilos
        Thread[] hilos = new Thread[10];

        // Creamos un bucle for que recorra el array de hilos
        for (int i = 0; i < hilos.length; i++) {
            /*
            Creamos un nuevo hilo que ejecute el run() de RellenarColumna.java
            Le pasamos el array y el indice al nuevo objeto
             */
            hilos[i] = new Thread(new RellenarColumna(array, i));

            // Iniciamos el proceso del hilo
            hilos[i].start();
        }

        // Creamos un bucle for que espere a que cada hilo del array hilos finalice
        for (int i = 0; i < hilos.length; i++) {
            try {
                // El main para aquí hasta que todos los hilos acaben
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimimos el array completo
        System.out.println("\nArray completo:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Imprimimos los valores recurrentemente
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}