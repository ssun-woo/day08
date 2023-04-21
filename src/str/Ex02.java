package str;

public class Ex02 {

	public static void main(String[] args) {

		int num = 1111;

		String st = num + "";
		// 문자열 + 숫자 >> 전부다 문자열이 됨
		System.out.println(st + num);

		int i = Integer.parseInt(st);
		// >> 문자형태의 숫자를 숫자로 바꿈
		// 실제 문자형태의 숫자만 가능하다(문자가 들어가면 에러발생)
		System.out.println(i + num);
		// 숫자 + 숫자 >> 숫자

		String st02 = "";
		st02 += "a";
		st02 += 'b';
		st02 += (char) ('c' - 32);
		System.out.println(st02);
		// 문자열에 문자열을 더하면 옆으로 계속 추가된 형태가 나온다
		// 아스키코드표에 의해 소문자-32 = 대문자

	}
}
