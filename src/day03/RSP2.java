package day03;

import java.util.Scanner;

public class RSP2 {
	public static void main(String[] args) {
		int com = (int) (Math.random() * 3);// 0 1 2
		String comstr = null;
		switch (com) {
		case 0:
			comstr = "����";
			break;
		case 1:
			comstr = "����";
			break;
		case 2:
			comstr = "��";
			break;
		}

		Scanner sc = new Scanner(System.in);
		int my = sc.nextInt();
		sc.close();
		
		String mystr = null;
		switch (my) {
		case 0:
			mystr = "����";
			break;
		case 1:
			mystr = "����";
			break;
		case 2:
			mystr = "��";
			break;
		}

		System.out.println("��ǻ��: " + comstr);
		System.out.println("�����: " + mystr);

		int result = (my - com + 2) % 3; // *����* 0user 1com 2draw
		switch(result) {
		case 0:
			System.out.println("����ڰ� �̰���ϴ�.");
			break;
		case 1:
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			break;
		case 2:
			System.out.println("�����ϴ�.");
			break;
		}

	}
}
