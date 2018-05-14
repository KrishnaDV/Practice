import java.util.HashMap;
import java.util.Set;

//Given an array a[0...n-1], where each element represents vote in election. Assume
//each vote is candidate ID of participant. Determine who wins election.

//Time Complexity : o(n) Space complexity : o(k) // no of candidates

public class WhoWinsElection {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 2, 2, 3, 3, 3, 1 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (hm.containsKey(a[i])) {

				int curr = hm.get(a[i]);

				curr = curr + 1;

				hm.remove(a[i]);

				hm.put(a[i], curr);

			}

			else {

				hm.put(a[i], 1);

			}

		}

		int maxcount = 0;
		int candidate = 0;

		Set<Integer> e = hm.keySet();

		for (int i : e) {

			int count = hm.get(i);

			if (count > maxcount) {

				candidate = i;
			}

		}

		System.out.println("Winner is " + candidate);

	}
	

}
