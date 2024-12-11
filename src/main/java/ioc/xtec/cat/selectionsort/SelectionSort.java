/**
 * Autor: Gabriel Serrano Duran]
 * Data: 11/12/2024
 * Versió: 1.0
 * Descripció: Clase per ordenar arrays d'enters
 *              i comprovar si un valor existeix dins de l'array.
 */

package ioc.xtec.cat.selectionsort;

public class SelectionSort {
   
   /**
    * Ordena un array d'enters passat per parametre mitjançant l'algorisme de Selection Sort.
    *
    * @param arr L'array d'enters a ordenar. No pot ser nul.
    */
   public void sort(int[] arr) {
        System.out.println("Gabriel Serrano Duran");
        System.out.println("He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
   
    /**
     * Comprova si un valor passat per parametre està en l'array.
     *
     * @param arr   L'array d'enters en el qual buscar. No pot ser nul.
     * @param value El valor a buscar dins de l'array.
     * @return {@code true} si l'array conté el valor, {@code false} altrament.
     * @throws IllegalArgumentException Si l'array és nul.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}