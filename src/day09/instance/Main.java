package day09.instance;

import day09.instance.A.C;

public class Main {
	public static void main(String args[]) {
		C c = new A.C();// �ٷ����� ����
		c.c = 4;
		c.methodC();
		System.out.println(c.c);
		c.staticC = 5;
		c.methodstaticC();

		A a = new A();// ����
		A.B b = a.new B();// ����
		b.b = 3;
		b.methodB();
		System.out.println(b.b);


		a.method();
//		System.out.println(d.d);
	}
}
