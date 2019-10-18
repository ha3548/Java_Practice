package day07;

public interface RemoteControl {
	// ���
	public static final int MAX_VOLUME = 20;
	public static final int MIN_VOLUME = 0;

	// �߻�޼ҵ�
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	public abstract int getVolume();
	
	//�Ϲݸ޼ҵ�
	public default void printTime() {
		System.out.println("����ð� ���");
	}
	//�����޼ҵ�
	public static void changeBattery() {
		System.out.println("���͸���ȯ");
	}
}
