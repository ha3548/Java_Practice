package day09_Ex;

class Outer2 {
	static class Inner2 {// ����Ŭ����: �ٷ����ٰ���
		int iv = 200;
	}
}

public class Exercise2 {
	public static void main(String args[]) {
		Outer2.Inner2 i = new Outer2.Inner2();
		System.out.println(i.iv);
	}

}
