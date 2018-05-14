import java.util.HashMap;
import java.util.Set;

// Find the number occuring odd number of times
public class Sort3 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 3, 1, 3 };

		oddTimes(a);

	}

	private static void oddTimes(int[] a) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (hm.containsKey(a[i])) {

				hm.put(a[i], hm.get(a[i]) + 1);

			}

			else {

				hm.put(a[i], 1);

			}
		}

		Set<Integer> s = hm.keySet();

		for (int b : s) {

			if ((hm.get(b) % 2) != 0) {

				System.out.println(b);

			}

		}
	}
}
