package TP_1.ejercicio_3;


public class Ejercicio_3 {


	public static Integer[] merge(Integer[] a, Integer[] b) {
		Integer[] c = new Integer[a.length + b.length];

		int indexOfC = 0;
		int indexOfA = 0;
		int indexOfB = 0;


		while (indexOfA < a.length) {
			if (a[indexOfA].compareTo(b[indexOfB]) <= 0) {
				c[indexOfC++] = a[indexOfA++];
			} else if (indexOfB <= b.length) {
				c[indexOfC++] = b[indexOfB++];
			}
		}

		while (indexOfB < b.length) {
			c[indexOfC++] = b[indexOfB++];
		}

		return c;
	}


}
