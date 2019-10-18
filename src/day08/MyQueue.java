package day08;

public class MyQueue {
	public static void main(String[] args) {
		Queue q = new Queue() {
			char[] charArr = new char[5];
			// 1 2 3 4 5
			int head = -1, tail = -1;

			@Override
			public int size() {
				return tail + 1;
			}

			@Override
			public Object peek() {
				char result = ' ';
				if (head != -1) {
					result = charArr[head];
				} else {
					System.out.println("�迭�� ���� �����ϴ�.");
				}
				return result;
			}

			@Override
			public Object pop() {
				if (tail == -1)
					System.out.println("�迭 EMPTY!");

				char temp = charArr[++head];// �а�
				charArr[head] = ' ';// ����

				if (head == tail) {
					head = -1;
					tail = -1;
				}
				return temp;
			}

			@Override
			public boolean push(Object ob) {
				if (tail + 1 < 5) {
					charArr[++tail] = (char) ob;
				} else {
					System.out.println("�迭 FULL!");
				}
				return true;
			}

			@Override
			public boolean empty() {
				if (tail == -1) {
					return true;
				} else {
					return false;
				}
			}
		};

		q.push('a');
		q.push('b');
		q.push('c');
		q.push('d');
		q.push('e');
		q.push('e');
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.empty());
	}

}

interface Queue {
	public abstract int size(); // ���� ����

	public abstract Object peek();// �б�

	public abstract Object pop();// �а� ����

	public abstract boolean push(Object ob);// ����

	public abstract boolean empty();
}