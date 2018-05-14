
public class RevWordsInSentence {

	public static void main(String[] args) {

		String s = " This is a Career Monk String ";

		String res = revWords(s);

		System.out.println(res);
	}

	private static String revWords(String s) {

		String[] n = s.trim().split(" ");

		int len = n.length;
		
		for (int i = 0; i < len / 2; i++) {

			String tmp = n[i];

			n[i] = n[(len - 1) - i];

			n[(len - 1) - i] = tmp;
		}

		StringBuffer sb = new StringBuffer();

		for (String s1 : n) {

			sb.append(s1 + " ");

		}

		return sb.toString();
	}
}
