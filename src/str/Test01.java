package str;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		String s1 = "Have a nice day Have a nice day Have a nice day";

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a') {
				arr.add(i);
			}
		}
		System.out.println("결과 : " + arr);
		System.out.println("===========================");

		String s2 = "It is a fun java programming";
		int count_a = 0, count_g = 0;
		for (int j = 0; j < s2.length(); j++) {
			if (s2.charAt(j) == 'a') {
				count_a++;
			} else if (s2.charAt(j) == 'g') {
				count_g++;
			}
		}
		System.out.println("총 개수 : " + s2.length());
		System.out.println("a 개수 : " + count_a);
		System.out.println("g 개수 : " + count_g);
		System.out.println("===========================");

		String s3 = "tESt sTring   change     first";
		String change_s3 = new String();

		change_s3 = s3.toLowerCase();
		String[] s = change_s3.split("");

		
		System.out.println("변경 전 : " + s3);
		for (int i = 0; i < change_s3.length(); i++) {
			if (s[i].equals(" ")) {
				s[i + 1] = s[i + 1].toUpperCase();
			} else if (i == 0) {
				s[i] = s[i].toUpperCase();
			}
			
			if (i == 0) {
				continue;
			} else {
				s[i] = s[i - 1] + s[i];
			}
			if (i == change_s3.length() - 1) {
				System.out.println("변경 후 : " + s[i]);
			}
		}

	}
}
