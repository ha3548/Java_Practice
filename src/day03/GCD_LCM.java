package day03;

public class GCD_LCM {
	public static void main(String[] args) {

		int x = 10;
		int y = 15;
		int min = (x < y) ? x : y;
		int GCD;
		int LCM;

		for (int i = min; i > 0; i--) {
			if (x % i == 0 && y % i == 0) {
				GCD = i;
				System.out.println("�ִ�����: " + GCD);

				LCM = x * y / GCD;
				System.out.println("�ּҰ����: " + LCM);

				break;
			}
		}

	}
}
