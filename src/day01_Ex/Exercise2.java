package day01_Ex;

public class Exercise2 {
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� �뷮
		int numOfBucket = (numOfApples % sizeOfBucket == 0) ? numOfApples / sizeOfBucket
				: numOfApples / sizeOfBucket + 1; // ��� ����� ��µ� �ʿ��� �ٱ����� ��

		System.out.println("�ʿ��� �ٱ����� ��:" + numOfBucket);
	}
}