package day02;

public class PrimeNum2 {
	public static void main(String[] args) {
		// 1~100���� �Ҽ� ���, ��������

		for (int j = 100; j >=1; j--) {
			
			int sosu = j;
			int cnt = 0;

			for (int i = 1; i <= sosu; i++) {
				if (sosu % i == 0) {
					cnt++;
				}
			}

			if (cnt == 2) {
				System.out.println(sosu + "��(��) �Ҽ��Դϴ�.");
			}
		}

	}
}