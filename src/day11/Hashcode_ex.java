package day11;

import java.util.*;

public class Hashcode_ex {
	public static void main(String args[]) {
		HashMap<Key, String> hashmap = new HashMap<>();
		hashmap.put(new Key(1), "ȫ�浿");

		String value = hashmap.get(new Key(1));
		System.out.println(value);
	}
}

class Key {
	public int number;

	Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// NULL��� -> hashCode()���ϰ��� �ٸ��⶧��

	@Override
	public int hashCode() {
		return number;
	}

	// ȫ�浿 ��� -> equals()�� hashCode()���ϰ��� ��� ����, ������ü�� ��
	// ����, equals()�� hashCode() ��� ������(Override)�ؾ��Ѵ�!

}