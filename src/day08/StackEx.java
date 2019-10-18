package day08;

public class StackEx {
	public static void main(String[] args) {
		Staack s1 = new Staack() {
			char[] charArr = new char[5];
			// 1 2 3 4 5
			int pointer = 0;

			@Override
			public boolean push(Object ob) {
				if (pointer < 5) {
					charArr[pointer++] = (char) ob;
				} else {
					System.out.println("�迭 FULL!");
				}
				return true;
			}

			@Override
			public Object pop() {
				char result = ' ';

				if (pointer != 0) {
					result = charArr[--pointer];
					charArr[pointer] = ' ';
				} else {
					System.out.println("�迭 �������!");
				}
				return result;
			}

			@Override
			public Object peek() {
				char result = ' ';
				if (pointer != 0) {
					result = charArr[--pointer]; // pointer �̸� ��
					pointer++;
				} else {
					System.out.println("�迭�� ���� �����ϴ�.");
				}
				return result;
			}

			@Override
			public int length() {
				return pointer;
			}

		};

		s1.push('a');
		s1.push('b');
		s1.push('c');
		s1.push('d');
		s1.push('e');
		s1.push('f');
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}

interface Staack {
	public abstract boolean push(Object ob);// ����

	public abstract Object pop();// ����

	public abstract Object peek();// �б�

	public abstract int length();// ���� ����Ǿ��ִ� �������� ����
}