package day01;

public class IfDiceEx {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 1);

		if (num == 1) {
			System.out.println(num);
			System.out.println("1�Դϴ�.");
		} else {
			System.out.println(num);
			System.out.println("1�� �ƴմϴ�.");
		}

	}
}
