public class InnerLoop {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (j < a.length - i - 1) {

					System.out.print(" ");

				} else {

					System.out.print("#");

				}
			}

			System.out.println();

		}

	}

}
