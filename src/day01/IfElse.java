package day01;

public class IfElse {
	public static void main(String[] args) {

		int a = 11;
		// ���ǹ�
		if (a == 10) {
			// ��
			System.out.println("a�� 10�Դϴ�.");
		} else {
			// ����
			System.out.println("a�� 10�� �ƴմϴ�.");
		}

		int b = 21;
		if (b % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		if (b % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}

	}
}