package day06;

public class Vehicle {
	void run() {
		System.out.println("Vehicle �޸��ϴ�.");
	}
}

class Bus extends Vehicle {
	void run() {
		System.out.println("Bus �޸��ϴ�.");
	}

	void price() {
		System.out.println("Bus ����� �޽��ϴ�.");
	}
}

class Taxi extends Vehicle {
	void run() {
		System.out.println("Taxi �޸��ϴ�.");
	}

	void price() {
		System.out.println("Taxi ����� �޽��ϴ�.");
	}
}