package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test01 {
	
	// 반복문 돌리는데
	// 할때마다 전에 나온 숫자랑 비교함
	// 3번째 차례 >> 2번째 1번째 숫자와 비교 같으면 다시
	// 5번째 차례 > 4,3,2,1 번째 숫자랑 비교 같으면 다시 
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
//		
//				
//		for(int i=0; i<6; i++) {
//			double ran = Math.random();
		//arr.add(ran);
//		}
//		System.out.println(arr);
		
		
		ArrayList<Integer> lotto = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			double ran = Math.random();
			int num = (int) (ran * 45) + 1;
			if(lotto.contains(num)) {
				i--;
			}else {
				lotto.add(num);
			}
		}
		System.out.println(lotto);
	}
	
	
	
	
	
}
