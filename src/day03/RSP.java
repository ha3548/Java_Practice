package day03;

import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����: ");
		int user = sc.nextInt();
		sc.close();
		
		int com = (int) (Math.random() * 3);
		System.out.println("��ǻ��: " + com);

		if(com==user) {
			System.out.println("�����ϴ�.");
			
		} else if(user>=0 && user<=2){
			if(com==0) {
				if(user==1)
					System.out.println("�̰���ϴ�.");
				else
					System.out.println("�����ϴ�.");
				
			} else if (com==1) {
				if(user==2)
					System.out.println("�̰���ϴ�.");
				else
					System.out.println("�����ϴ�.");				
				
			} else if (com==2) {
				if(user==0)
					System.out.println("�̰���ϴ�.");
				else
					System.out.println("�����ϴ�.");				
			}
			
		} else {
			System.out.println("�߸����Է�!");
		}

		
	}
}
