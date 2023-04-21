package str;

public class Test02 {

	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";

		System.out.println("=====변경전str=====");
		System.out.println(str);

		String change_str = new String();
		change_str = str.replace("-", ":");
		change_str = change_str.replace("2017", "1999");
		change_str = change_str.replace("2015", "1999");
		change_str = change_str.replace("2018", "1999");

		System.out.println("=====변경후str=====");
		System.out.println(change_str);
	}
}
