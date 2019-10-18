package day11_Ex;

import java.util.HashMap;

public class Exercise03 {

	public static void main(String[] args) {
		HashMap<Student, String> hashmap = new HashMap<>();
		hashmap.put(new Student("1"), "95");

		String score = hashmap.get(new Student("1"));
		System.out.println("1�� �л��� ����: " + score);
	}

}

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student compareKey = (Student) obj;
			if (this.studentNum == compareKey.studentNum) {
				return true;
			}
		}
		return false;
	}

	// ERROR -> hashCode()���ϰ��� �ٸ��⶧��

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}