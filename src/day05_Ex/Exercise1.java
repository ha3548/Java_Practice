package day05_Ex;

public class Exercise1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());
	}
}

class Student {
	String name;
	int ban, no, kor, eng, math;

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		// return ((int) (((float) (getTotal() / 3f + 0.05)) * 10)) / 10f;
		return (float) (Math.round(getTotal() / 3f * 10) / 10.0);
	}
}