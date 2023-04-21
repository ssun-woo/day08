package str;

public class Ex01 {
	public static void main(String[] args) {

		String s = new String();
		// 이렇게 하면 자동으로 null값이 들어간다
		s = "aBcD";
		System.out.println("원래 형태 :" + s);
		// 변수형의 첫 글자가 대문자 >> 변수명 옆에 .을 찍으면 기능이 있음
		// 변수형의 첫 글자가 소문자 >> 변수명 옆에 .을 찍어도 기능이 따로 없음

		s = s.toUpperCase();
		System.out.println("toUpperCase : " + s);

		s = s.toLowerCase();
		System.out.println("toLowerCase : " + s);

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		// 문자열을 index 별로 표현 가능

	}
}
