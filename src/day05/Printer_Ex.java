package day05;

//CH06_Ex16
public class Printer_Ex {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.Println(10);
		p.Println(true);
		p.Println(5.7);
		p.Println("ȫ�浿");
	}
}

class Printer {// ���� ��ũ��Ʈ ������ Ŭ���� ���鶧�� Public ���X

		void Println(int x) {
			System.out.println(x);
		}
	
		void Println(boolean x) {
			System.out.println(x);
		}
	
		void Println(double x) {
			System.out.println(x);
		}
	
		void Println(String x) {
			System.out.println(x);
		}

}