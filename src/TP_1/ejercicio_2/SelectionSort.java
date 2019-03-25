package TP_1.ejercicio_2;

public class SelectionSort {

    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min_index])
                    min_index = j;
            }
            // Swap the found minimum element with the first element
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    public void sortStringArray(String[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j].compareTo(array[min_index]) < 0)
                    min_index = j;
            }
            // Swap the found minimum element with the first element
            String temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    //-----------------------------------------------------------

    //For all types of data

    public <T> void allTypesSort(Comparable<T>[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j].compareTo((T)array[min_index]) < 0)
                    min_index = j;
            }
            // Swap the found minimum element with the first element
            Comparable<T> temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    //-----------------------------------------------------------

    //For recursive selection sort

    public void recursiveSort(int[] array, int n, int index){
        if(index == n){
            return;
        }

        int k = minIndex(array, index, n-1);

        if(k != index){
            int temp = array[k];
            array[k] = array[index];
            array[index] = temp;
        }

        recursiveSort(array, n, index+1);
    }

    public int minIndex(int[] array, int i, int j){
        if(i == j){
            return i;
        }

        int k = minIndex(array, i+1, j);

        return (array[i] < array[k])? i : k;
    }

    //-----------------------------------------------------------


    // Prints the array
    void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    // Test
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] array = {60, 25, 10, 22, 11};
        ob.sort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}
