package testers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q {

	public static void main(String[] args) {

		String str1 = "I live in ";
		String str2 = "I live in ";

		List<String> str1Words = new ArrayList<>(Arrays.asList(str1.split(" ")));
		List<String> str2Words = new ArrayList<>(Arrays.asList(str2.split(" ")));
		List<String> str3Words = new ArrayList<>(str1Words);

		// Remove common words from str1Words
		str1Words.removeAll(str2Words);

		// Remove common words from str2Words
		str2Words.removeAll(str3Words);

		// Concatenate the remaining words from str1Words and str2Words
		List<String> uniqueWords = new ArrayList<>();
		uniqueWords.addAll(str1Words);
		uniqueWords.addAll(str2Words);

		if (uniqueWords.isEmpty()) {
		}
		System.out.println(uniqueWords);
		anagram();
	}

	public static void anagram() {

		String str1 = "Race";
		String str2 = "Care";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// check if length is same
		if (str1.length() == str2.length()) {

			// convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			System.out.println(charArray1);
			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same
			// then the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}

}
