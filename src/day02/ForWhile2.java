package day02;

public class ForWhile2 {
	public static void main(String[] args) {
		// 1~100 �����߿� 3�ǹ���� 5�ǹ���� ���, ��ġ�� ���� �ѹ���

		for (int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}

			/*if (i % 15 == 0) {

			} else if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}*/
			
		}

	}
}
