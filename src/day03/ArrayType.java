package day03;

public class ArrayType {
	public static void main(String[] args) {
		// ���1
		int arr2[] = { 11, 12, 13 };
		// ���2
		int[] arr1 = { 10, 20, 30 };
		// ���3
		int[] arr3 = new int[3];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;

		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}

		String[] arrStr = new String[3];
		arrStr[0] = "������";
		arrStr[1] = "ȭ����";
		arrStr[2] = "������";
		
		System.out.println("length: "+arrStr.length);

		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
	}
}
