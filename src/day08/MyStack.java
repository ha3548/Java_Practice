package day08;

public class MyStack implements Stack {
	private OdolNode topNode;

	public MyStack() {
		this.topNode = null;
	}

	@Override
	public boolean push(Object data) {
		// ���ο� ��� ����
		OdolNode newNode = new OdolNode(data);
		// ���ο� ����� ������带 ���� ������ top�� �����ϵ���
		newNode.setNextNode(topNode);
		// ���� ������ ž�� ���ο� ���
		topNode = newNode;
		return false;
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("empty");
		} else {
			// ž����� ������
			Object data = peek();
			// ���ο� ž���� ���� ž����� nextNode
			topNode = topNode.getNextNode();
			// ������ ��ȯ
			return data;

		}

	}

	@Override
	public Object peek() {

		if (isEmpty()) {
			throw new IndexOutOfBoundsException();

		} else {
			return topNode.getData(); // �����͸� ��ȯ
		}
	}

	public boolean isEmpty() {
		return (topNode == null);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public static void main(String args[]) {
		MyStack ls = new MyStack();

		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
	}

}

class OdolNode { // ���ÿ� Ȱ���� ��� Ŭ����

	private Object data; // �����͸� ����
	private OdolNode nextNode; // ������ ��带 �����ϱ� ���� ���

	public OdolNode(Object data) {
		this.data = data;
		this.nextNode = null;
	}

	public Object getData() {
		return data;
	}

	public void setNextNode(OdolNode node) {
		nextNode = node;
	}

	public OdolNode getNextNode() {
		return nextNode;
	}

}

interface Stack {
	public abstract int length();// ���� ����Ǿ��ִ� �������� ����

	public abstract Object pop();// ����

	public abstract boolean push(Object ob);// ����

	public abstract Object peek();// �б�
}