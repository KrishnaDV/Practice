import java.util.Arrays;

public class Find2EleWhoseSumIsCloseTo0 {

	public static void main(String[] args) {

		int a[] = { 1, 60, -10, 70, -80, 85 };

		Arrays.sort(a);

		int minSum = Integer.MAX_VALUE;

		int maxSum = Integer.MIN_VALUE;


		int i = 0, j = a.length - 1;

		while (i < j) {

			int tmp = a[i] + a[j];

			if (tmp > 0) {

				if (tmp < minSum) 

					minSum = tmp;

				j--;

			}

			else if (tmp < 0) {

				if (tmp > maxSum) 

					maxSum = tmp;


				i++;
			}

		}

		System.out.println(Math.abs(maxSum)<minSum ? maxSum : minSum );

	}

}
