package problems;

public class NutsAndBolts {

	public static void match(char[] nuts, char[] bolts) {

		for (int i = 0; i < bolts.length; i++) {

			for (int j = 0; j < nuts.length; j++) {

				if (bolts[i] == nuts[j]) {

					char temp = nuts[j];
					nuts[j] = nuts[i];
					nuts[i] = temp;

				}
			}

		}

		for (char c : nuts) {
			System.out.print(c + ",");
		}

	}

	public static void main(String[] args) {

		char[] nuts = { '$', '%', '&', 'x', '@' };
		char[] bolts = { '%', '@', 'x', '$', '&' };
		match(nuts, bolts);

	}

}
