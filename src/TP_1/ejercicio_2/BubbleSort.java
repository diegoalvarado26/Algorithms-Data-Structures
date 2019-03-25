package TP_1.ejercicio_2;

public class BubbleSort {

    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sortStringArray(String[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    // swap arr[j+1] and arr[i]
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //-----------------------------------------------------------

    //For all types of data

    public <T> void allTypesSort(Comparable<T>[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j].compareTo((T)array[j+1]) > 0) {
                    // swap arr[j+1] and arr[i]
                    Comparable<T> temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
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
        BubbleSort ob = new BubbleSort();
        int[] array = {60, 25, 10, 22, 11};
        ob.sort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}
