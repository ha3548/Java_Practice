package day05;

public class Static_ex {

	int field1;
	void method1() {

	}

	static int field2;
	static void method2() {

	}

	static {
		// ERROR! �޸𸮿� �������� �ʰ�����.
		//field1 = 10;
		//method1();

		// Static�������� �޸𸮿� �ö�����.
		field2 = 20;
		method2();
	}
}
