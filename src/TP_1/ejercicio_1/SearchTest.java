package TP_1.ejercicio_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {


    Search search = new Search();
    @Test
    void sequentialSearch() {
        int[] array1 = {1, 4, 5, 6, 7, 3};
        assertEquals(-1, search.sequentialSearch(array1, 2));
        assertEquals(1, search.sequentialSearch(array1, 4) );
    }

    @Test
    void binarySearch() {
        int[] array2 = {1, 3, 5, 7, 9};
        assertEquals(1, search.binarySearch(array2, 0, array2.length-1, 3));
        assertEquals(-1, search.binarySearch(array2, 0, array2.length-1, 14));

    }
}