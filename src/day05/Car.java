package day05;

public class Car {
	String master;
	int cSpeed; // 10 up
	int gas; // 10 down
	int maxSpeed;

	Car() { // �ʱⰪ ����
		cSpeed = 0;
		gas = 100;
		maxSpeed = 200;
	}

	void accel() {
		if (gas >= 10 && cSpeed <= maxSpeed) {
			if (cSpeed <= maxSpeed - 10) {
				cSpeed += 10;
				gas -= 10;
			} else if (cSpeed == maxSpeed) {
				System.out.println("�����ְ�ӵ�!");
			} else {
				cSpeed = maxSpeed;
				gas -= 10;
			}
		} else {
			System.out.println("�⸧�ܷ�����!");
		}
	}

	void stop() {
		if (cSpeed > 20) {
			cSpeed -= 20;
		} else if (cSpeed == 0) {
			System.out.println("�̹� ��������!");
		} else {
			cSpeed = 0;
		}
	}

	void speed_ck() {
		System.out.println(cSpeed + "km");
	}

}
