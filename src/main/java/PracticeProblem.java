public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String repeatLetter (char letter, int num) {
		String result = "";

		for (int i = 0; i < num; i++ ) {
			result = result + letter;
		}

		return result;
	}

	public static int countLetter (String word, char letter) {
		int count= 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)== letter){
				count = count + 1;
			}
		}

		return count ;
	}

	public static int evenSum (int num1, int num2) {
		int sum = 0;

		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		for (int i = num2; i<= num1; i++) {
			if (i% 2 == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}
	
}
