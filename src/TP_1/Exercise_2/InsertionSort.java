package TP_1.Exercise_2;

public class InsertionSort {

    public void sort(int[] array){
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
    }

    public void sortStringArray(String[] array){
        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j].compareTo(key) > 0){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
    }

    //-----------------------------------------------------------

    //For all types of data

    public <T> void allTypesSort(Comparable<T>[] array){
        int n = array.length;

        for (int i = 1; i < n; i++) {
            Comparable<T> key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j].compareTo((T)key) > 0){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
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
        InsertionSort ob = new InsertionSort();
        int[] array = {60, 25, 10, 22, 11};
        ob.sort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }}
