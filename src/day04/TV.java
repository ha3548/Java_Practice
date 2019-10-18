package day04;

public class TV {
	String company;
	int size;
	int price;
	boolean power;
	int volume;
	int channel;

	TV(String company) {
		this.company = company;
		power = false;
		size = 65;
		price = 1000000;
		volume = 0;

	}

	void powerOn() {
		power = true;
		System.out.println("����: ON");
	}

	void powerOff() {
		power = false;
		System.out.println("����: Off");
	}

	void volumeUp() {
		if (power) {
			if (volume < 100) {
				volume++;
				System.out.println("����: " + volume);
			} else {
				System.out.println("���� ������ �ִ��Դϴ�.");
			}
		}
	}

	void volumeDown() {
		if (power) {
			if (volume > 0) {
				volume--;
				System.out.println("����: " + volume);
			} else {
				System.out.println("���� ������ 0�Դϴ�.");
			}
		}
	}

	void channel_ck(int c) {
		if (power) {
			channel = c;
			System.out.println("ä��: " + channel);
		}
	}

}
