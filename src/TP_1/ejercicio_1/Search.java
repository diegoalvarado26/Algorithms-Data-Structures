package TP_1.ejercicio_1;

public class Search {

    int sequentialSearch(int[] elements, int target)
    {
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                // Devuelve la posición en la que encontró el
                //elemento en el array.
                return j;
            }
        }
        // Si no lo encuentra, devuelve -1.
        return -1;
    }

    int binarySearch(int arr[], int l, int r, int x)
//Implementación recursiva de de Binary Search.
//Devuelve la posición del elemento x en el array arr[l, ..., r].
//Si no está, devuelve -1.
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // Si el elemento está en el medio
            if (arr[mid] == x)
                return mid;

            // Si el elemento es menor que el del medio, entonces
            // solo puede estar presente en la parte izquierda
            //del arreglo.
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Sino, solo puede estar presente en la derecha.
            return binarySearch(arr, mid + 1, r, x);
        }
        // Si no lo encuentra, devuelve -1.
        return -1;
    }
}
