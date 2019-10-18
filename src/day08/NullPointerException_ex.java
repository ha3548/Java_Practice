package day08;

//import java.lang.*

public class NullPointerException_ex {
	public static void main(String[] args) {

		try {// ���ܰ� �߻��� ���ɼ��� �ִ� ����

			char[] ch = new char[5];
			System.out.println(ch[5]);// ArrayIndexOutOfBoundsException

			String data = "data";// NullPointerException
			System.out.println(data.toString());

			String data1 = "100";
			String data2 = "a100";// NumberFormatException

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {// ���� �߻��� ó������
			System.out.println("ArrayIndexOutOfBoundsException �߻� Ȥ��");
			System.out.println("NullPointerException �߻�");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Exception �߻�");

		} finally {// ���� ������� �ݵ�� ����Ǵ� ����
			System.out.println("Exception Ȯ�� ����");
		}

		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = dog;
		dog = (Dog) animal;
		changeDog(animal);
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}