package day08;

public class MyException extends Exception {

	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}

	public static void main(String[] args) {
		int data = 10;
		if (data == 10) {
			try {
				throw new MyException("���� ����ó�� �߻�");
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
	}
}
