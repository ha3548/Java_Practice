package day09.instance;

interface Vehicle {
	public void run();
}

class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};

	void method1() {
		Vehicle localVal = new Vehicle() {
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		localVal.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}

public class Anonymous_ex {
	public static void main(String args[]) {
		Anonymous a = new Anonymous();
		a.field.run();// �͸�ü �ʵ�
		a.method1();// �͸�ü ���ú���
		a.method2(new Vehicle() {// �͸�ü �Ű���
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}
		});
	}
}
