package day07;

public abstract class Phone {//�߻�Ŭ����
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("Phone ����: ON");
	}

	public void turnOff() {
		System.out.println("Phone ����: OFF");
	}

	// �߻� �޼ҵ�: ���� �ϰ�, ������ �ڽ�Ŭ�������� ����
	public abstract void sound();
}
