package day02;

public class ForWhile3 {
	public static void main(String[] args) {
		//1~100���� ����ϴµ�, 10������ �ٹٲ�
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");

			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
}
