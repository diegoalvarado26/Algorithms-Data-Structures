package TP_1.Exercise_2;

import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    private int n = 10;
    private int[] array = RandomArray.randomArray(n);
    private int[] array2 = array.clone();
    private int[] array3 = array.clone();
    private long startTime, endTime;

    @Test
    public void test001_SelectionSortTime(){
        SelectionSort selectionSort = new SelectionSort();

        startTime = System.currentTimeMillis();
        selectionSort.sort(array);
        endTime = System.currentTimeMillis();

        System.out.println("SelectionSort time for " + n +" elements: " + (endTime-startTime));
    }

    @Test
    public void test002_InsertionSortTime(){
        InsertionSort insertionSort = new InsertionSort();

        startTime = System.currentTimeMillis();
        insertionSort.sort(array2);
        endTime = System.currentTimeMillis();

        System.out.println("InsertionSort time for " + n +" elements: " + (endTime-startTime));
    }

    @Test
    public void test003_BubbleSortTime(){
        BubbleSort bubbleSort = new BubbleSort();

        startTime = System.currentTimeMillis();
        bubbleSort.sort(array3);
        endTime = System.currentTimeMillis();

        System.out.println("BubbleSort time for " + n +" elements: " + (endTime-startTime));
    }

    @Test
    public void test004_BubbleSortString(){
        BubbleSort bubbleSort = new BubbleSort();

        String[] stringArray = {"hola", "como", "estas"};

        bubbleSort.sortStringArray(stringArray);

        System.out.println(Arrays.toString(stringArray));
    }

    @Test
    public void test005_SelectionSortRecursive(){
        SelectionSort selectionSort = new SelectionSort();

        System.out.println(Arrays.toString(array));

        selectionSort.recursiveSort(array, array.length, 0);

        System.out.println(Arrays.toString(array));
    }

    @Test
    public void test006_BubbleSortAllTypes(){
        BubbleSort bubbleSort = new BubbleSort();

        Plane[] planes = {new Plane(20, "Latam"), new Plane(15, "Aerolineas"), new Plane(20, "Aerolineas"), new Plane(15, "Latam")};

        for (int i = 0; i < planes.length; i++) {
            System.out.print("Company: " + planes[i].getCompany() + " ID: " + planes[i].getId() + "\n");
        }

        System.out.println();

        bubbleSort.allTypesSort(planes);

        for (int i = 0; i < planes.length; i++) {
            System.out.print("Company: " + planes[i].getCompany() + " ID: " + planes[i].getId() + "\n");
        }
    }
}