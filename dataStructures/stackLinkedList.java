public class stackLinkedList {
	
	private Node first = null;
	private class Node {
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void push(String element){
		Node oldNode = first;
		first = new Node();
		first.item = element;
		first.next = oldNode;		
	}
	
	public String pop(){
		String item = first.item;
		first = first.next;
		return item;
	}

}
