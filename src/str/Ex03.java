package str;

public class Ex03 {

	public static void main(String[] args) {

		String id = "test                   ";
		id = id.trim();
		// .trim : 양쪽의 공백을 삭제해줌
		// .charAt(0) 과 마찬가지로 일시적으로 변하는것뿐, 저장되진 않는다
		System.out.println(id + "!");
		if (id.equals("test")) {
			System.out.println("인증통과");
		} else {
			System.out.println("인증실패");
		}

		// String addr = "우편번호주소상세주소";
		String addr = "우편번호/주소/상세주소";

		String[] s = addr.split("/");
		// (어떤값을 기준으로 나눌건지)
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		System.out.println("addr : " + addr);
		addr = addr.replace("/", "=>");
		System.out.println("addr : " + addr);

	}
}
