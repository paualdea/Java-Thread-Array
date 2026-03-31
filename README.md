# Programación en Java: Multihilo y Matrices

Este proyecto ha sido desarrollado como parte de la **Actividad 1** de la Unidad de Trabajo 2 (UT2): "Programación Multihilo".

El programa implementa un sistema que utiliza la ejecución de un proceso mediante hilos (*threads*) para rellenar un *array* de 25 filas por 10 columnas. Se asigna un hilo específico para cada columna, demostrando cómo repartir el trabajo entre diversos hilos sin conflictos de escritura.

## Características Principales

* **Interfaz Runnable**: Implementación de la interfaz `Runnable` en la clase `RellenarColumna` para definir la tarea a ejecutar.
* **Gestión de Hilos**: Uso de un array de objetos `Thread` para controlar y lanzar múltiples procesos. Cada hilo introduce enteros en un numero de columna asignado.
* **Sincronización con Join**: Uso del método `.join()` para asegurar que el hilo principal (`Main`) espere la finalización de todos los hilos antes de mostrar el resultado final.

## Funcionamiento

El programa sigue el siguiente flujo:

1. **Inicialización**: Se crea un *array* bidimensional de 25 filas y 10 columnas y un array de 10 *threads*.
2. **Creación de hilos**: Se crean 10 instancias de los hilos pasando como parámetro el *array* y el índice de la columna que les corresponde.
3. **Ejecución**: Cada hilo ejecuta su método `run()` de forma independiente, rellenando las 25 filas de su columna correctamente.
4. **Muestra de Resultados**: El programa espera a que los 10 hilos terminen su ejecución y luego muestra el *array* entero por pantalla.

## Instrucciones de Uso

Para ejecutar este programa, se puede usar el fichero `.jar` o el código fuente desde las *releases* del proyecto.