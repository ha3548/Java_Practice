package day07;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	@Override
	public void sound() {
		System.out.println("RING~RING~RING~");
	}

}
