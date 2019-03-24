package TP_1.ejercicio_3;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Ejercicio_3Test {

	@Test
	void merge() {
		Integer[] a = {3, 5, 7, 8, 13};
		Integer[] b = {28, 45, 3, 1, 0, 6, 1, 3, 89};

		Arrays.sort(a);
		Arrays.sort(b);

		Integer[] c = Ejercicio_3.<Integer>merge(a, b);

		Integer[] correctC = {0, 1, 1, 3, 3, 3, 5, 6, 7, 8, 13, 28, 45, 89};

		Assert.assertArrayEquals(correctC, c);
	}
}