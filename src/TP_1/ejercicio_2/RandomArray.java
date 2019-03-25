package TP_1.ejercicio_2;

import java.util.Random;

public class RandomArray {

    static int[] randomArray(int n){
        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
