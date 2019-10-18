package day05;

public class Asurada {
	String master;
	boolean power;
	String mode;// D ����, B ����, N �븻
	int cSpeed; // 10 up
	int gas; // 10 down
	int maxSpeed;

	Asurada() { // �ʱⰪ ����
		cSpeed = 0;
		gas = 100;
		maxSpeed = 200;
		power = false;
	}

	Asurada(String master) {
		this(); // Asurada() ������ ȣ��
		if (master == "Bong") {
			System.out.println("������ " + master);
			power = true;
		}
	}

	void transfer(String mode) {
		if (power && this.mode == "N" && mode == "D") {
			this.mode = mode;// N -> D
		} else if (power && this.mode == "D" && mode == "B") {
			this.mode = mode;// D -> B
		} else if (power && mode == "N") {
			this.mode = mode;// D,B -> N
		} else {
			System.out.println("������ �� �� ����!");
			System.out.println("����� ���ְ� �ƴմϴ�.");
		}
	}

	void booster() {
		if (power && mode == "B") {
			cSpeed = 300;
			gas -= 20;
			System.out.println("**Booster ON**");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);// 1��
					System.out.println("Booster: " + (i + 1) + "��");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("**Booster OFF**");
			cSpeed = maxSpeed;

		} else {
			System.out.println("�ν��� ��带 ������ �� �����ϴ�.");
		}

	}

	void accel() {
		if (power && this.mode == "D") {
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
	}

	void stop() {
		if (power) {
			if (cSpeed > 20) {
				cSpeed -= 20;
			} else if (cSpeed == 0) {
				System.out.println("�̹� ��������!");
			} else {
				cSpeed = 0;
			}
		}
	}

	void speed_ck() {
		System.out.println(cSpeed + "km");
	}

}
