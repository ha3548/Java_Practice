package day09.instance;

public class A {
	A() {
		System.out.println("A() ��ü����");
	}

	// �ʵ�
	int a;
	static int staticA;

//	A classA = new A();
	B classB = new B();
	C classC = new C();
//	D classD = new D(); ����Ŭ������ ERROR!

	static A staticClassA = new A();
//	static B staticClassB = new B();
	static C staticClassC = new C();
//	static D staticClassD = new D();

	void methodA() {
		a = 10;
		staticA = 20;

//s		classA.a = 30;
		classB.b = 40;
		classC.c = 50;

		staticClassA.a = 60;
		staticClassC.c = 70;

		B classBB = new B();
		C classCC = new C();

	}

	static void methodB() {
//		a=10;
		staticA = 20;

		staticClassA.a = 110;
		staticClassC.c = 120;

//		B classBB = new B();
		C classCCC = new C();
		classCCC.c = 150;
	}

// �ν��Ͻ� Ŭ����(���)
	class B {
		B() {
			System.out.println("A.B() ��ü����");
		}

		int b;

		void methodB() {
		}
//		static int staticB;
//		static void methodstaticB() {}
	}

// ���� Ŭ����(���)
	static class C {
		C() {
			System.out.println("A.C() ��ü����");
		}

		int c;

		void methodC() {
		}

		static int staticC;

		static void methodstaticC() {
		}

	}

	// ���� Ŭ����
	void method() {
		class D {
			D() {
				System.out.println("A.method().D() ��ü����");
			}

			int d;

			void methodD() {
			}
//			static int staticD;
//			static void methodstaticD() {}
		}

		D d = new D();
		d.d = 6;
		d.methodD();
		System.out.println(d.d);
	}
}
