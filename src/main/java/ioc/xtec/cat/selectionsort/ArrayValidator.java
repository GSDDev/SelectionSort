/**
 * Autor: Gabriel Serrano Duran]
 * Data: 11/12/2024
 * Versió: 1.0
 * Descripció: clase per validar un array.
 */

package ioc.xtec.cat.selectionsort;

public class ArrayValidator {
    
    /**
     * Valida que l'array no sigui nul ni buit.
     *
     * @param arr L'array d'enters a validar.
     * @throws IllegalArgumentException Si l'array és nul o buit.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
