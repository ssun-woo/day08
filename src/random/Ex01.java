package random;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {

		System.out.println(Math.random());
		// 범위는 0~0.999999999

		ArrayList<Integer> lotto = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			double ran = Math.random();
//			System.out.println((int) (ran * 45) + 1);
			lotto.add((int) (ran * 45) + 1);
		}
		System.out.println(lotto);

		// 0~0.999999999 * 3 >> 0.000 ~ 2.999999 >> (int)0~2

	}
}
