import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();

			int res = 1;

			if (n % 2 == 0) {

				while (n > 0) {
					if (n % 2 == 0) {

						res = res * 2;

					}

					else {

						res = res + 1;

					}

					n--;
				}
				System.out.println(res);

			} else {

				while (n > 0) {
					if (n % 2 == 0) {

						res = res + 1;

					}

					else {

						res = res * 2;

					}

					n--;
				}
				System.out.println(res);

			}

		}

	}

}
