package day05_Ex;

public class Exercise4 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
	}

	static boolean isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9');
			else
				return false;
		}
		return true;
	}
}
