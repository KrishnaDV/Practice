public class CharArr {
	public static void main(String[] args) {

		char[] a = { '1', '1', 't' };

		String b = String.valueOf(a);

		char[] g = b.toCharArray();

		for (char v : g) {

			System.out.println(Character.toUpperCase(v));

		}

		char t = 'P';

		System.out.println(Character.toLowerCase(t));

		System.out.println(b);

		System.out.println(a.toString());

		int i = 10;

		System.out.println(String.valueOf(i));

	}
}
