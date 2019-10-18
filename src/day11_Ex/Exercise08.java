package day11_Ex;

import java.util.StringTokenizer;

public class Exercise08 {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";

		String[] test = str.split(",");
		for (String t : test) {
			System.out.println(t);
		}
		System.out.println();

		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
