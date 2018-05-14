import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// Array of LinkedLists

//eg: ll = [0,1,2,3,4,5]
//			|
//			1
//			|
//			2

public class LinkedlistInsideLL {

	public static void main(String[] args) {

		LinkedList<Integer>[] ll = new LinkedList[5];

		Scanner s = new Scanner(System.in);

		int l = s.nextInt();

		for (int i = 0; i < 5; i++) {

			ll[i] = new LinkedList<Integer>();

		}

		ll[l].add(l);

		Iterator<Integer> it = ll[l].iterator();

		while (it.hasNext()) {

			int i1 = it.next();

			System.out.println(i1);

		}

	}
}
