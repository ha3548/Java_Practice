package day01;

public class CH03_Ex {
	public static void main(String[] args) {
		// 2��
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);// 11 + 20
		System.out.println(z);
		System.out.println();

		// 3��
		int score = 85;
		String result = (!(score > 90)) ? "��" : "��";
		System.out.println(result);
		System.out.println();

		// 4��
		int pencils = 534;
		int students = 30;

		int pencilPerStudent = pencils / students;
		System.out.println(pencilPerStudent);
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		System.out.println();

		// 5��
		int value = 356;
		System.out.println((value / 100) * 100);
		System.out.println();

		// 6��
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthBottom + lengthTop) * height) / 2.0;
		System.out.println(area);
		System.out.println();

		// 7��
		int x1 = 10;
		int y1 = 5;
		System.out.println((x1 > 7) && (y1 <= 5)); // T
		System.out.println((x1 % 3 == 2) || (y1 % 2 != 1)); // F
		System.out.println();

		// 8��
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = x2 % y2;

		if (y2 == 0) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result1 = z2 + 10;
			System.out.println("���: " + result1);
		}
	}
}
