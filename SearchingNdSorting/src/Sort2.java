import java.util.HashMap;
import java.util.Set;

//Find two repeating elements in the given array
public class Sort2 {

	public static void main(String[] args) {

		int a[] = { 4, 2, 4, 5, 2, 3, 1 };

		repeatEle(a);

	}

	private static void repeatEle(int[] a) {

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

			if (hm.get(b) > 1) {

				System.out.println(b);

			}

		}

	}
}
