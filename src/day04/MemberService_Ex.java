package day04;

public class MemberService_Ex {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result=ms.login("hong","12345");
		
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			ms.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
