package day11;

public class Equal_ex {
	public static void main(String args[]) {
		Member m1 = new Member("blue", "12345");
		Member m2 = new Member("blue", "12345");
		Member m3 = new Member("red", "12345");

		if (m1.equals(m2)) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}
		
		if (m1.equals(m3)) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}
	}
}

class Member /* extends Object */ {
	public String id;
	public String pw;

	Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id) && pw.equals(member.pw)) {
				return true;
			}
		}
		return false;
	}
}