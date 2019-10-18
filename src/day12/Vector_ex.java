package day12;

import java.util.*;

public class Vector_ex {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		
		List<Board> linked = new LinkedList<>();
		linked.add(new Board("����3", "����3", "�۾���3"));
		linked.add(new Board("����4", "����4", "�۾���4"));
		
		for (int i = 0; i < 2; i++) {
			Board b1 = list.get(i);
			System.out.print(b1.content);
			System.out.print(b1.subject);
			System.out.print(b1.writter);
			System.out.println();
		}
		
		for (int i = 0; i < 2; i++) {
			Board b2 = linked.get(i);
			System.out.print(b2.content);
			System.out.print(b2.subject);
			System.out.print(b2.writter);
			System.out.println();
		}

	}

}

class Board {
	String subject, content, writter;

	Board(String s, String c, String w) {
		subject = s;
		content = c;
		writter = w;
	}
}