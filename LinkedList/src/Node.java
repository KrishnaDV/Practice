public class Node {

	private String data;
	private Node next;

	public Node getNext() {
		return next;
	}

	public Node(String data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
