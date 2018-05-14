public class CountingSort {

	public static void main(String[] args) {

		int a[] = { 1, 4, 2, 1, 4, 3 };

		int b[] = new int[a.length];

		countingSort(a, b, 5);

		for (int g : b) {

			System.out.print(g + " ");

		}

	}

	private static void countingSort(int[] a, int[] b, int k) {

		int c[] = new int[k];

		for (int i = 0; i < k; i++) {

			c[i] = 0;

		}

		for (int j = 0; j < a.length; j++) {

			c[a[j]] = c[a[j]] + 1;

		}

		for (int i = 1; i < k; i++) {

			c[i] = c[i] + c[i - 1];

		}

		for (int j = 0; j < a.length; j++) {

			c[a[j]] = c[a[j]] - 1;

			b[c[a[j]]] = a[j];

		}

	}

}
