package day01;

public class PromotionEx {
	public static void main(String[] args) {

		// ������
		int a = 10;
		int b = 20;
		// �Ǽ���
		double douA = 20;
		double douB = 0;

		douB = douA + (double) a; // 20.0 + 10.0

		System.out.println(douB);

		b = (int) douB;
		System.out.println(b);

		System.out.println(Byte.MAX_VALUE); // �ִ밪 127
		System.out.println(Byte.MIN_VALUE); // �ּҰ� -128
	}
} // ���� Ÿ�� ��ȯ�� �ǵ��� ��������!
