package day02;

public class ForWhile {
	public static void main(String[] args) {

		// �ʱⰪ; ����; ����
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println(sum);

	}
}
