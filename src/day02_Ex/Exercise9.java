package day02_Ex;

public class Exercise9 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;// �Ųٷ� �ٲۼ�

		while (tmp != 0) {
			result = (result * 10) + tmp % 10;
			tmp = tmp / 10;
		}

		System.out.println("�Ųٷ� �ٲ� ��: " + result);

		if (number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}
}
