package day06;

public class InstanceOf {
	public static void main(String[] args) {
		A a = new B();//�ڵ� ����ȯ
		// A a = new C();

		boolean result = false;
		result = a instanceof B;
		System.out.println(result);

		if (result == true) {
			B b = (B) a;//���� ����ȯ
			b.methodA();
			b.methodB();
		} else {
			System.out.println("���� ����ȯ�� �� �� ����!");
		}
	}
}
