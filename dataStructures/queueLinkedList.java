
public class queueLinkedList {
	private Node firstNode = null;
	private Node lastNode = null;
	private int i = 0;
	private class Node{
		String item;
		Node next;
	}
	
	public void enqueue(String element){
		Node node = new Node();
		if(i == 0){
			firstNode.item = element;
			firstNode.next = lastNode;
		} else {
			lastNode.item = element;
			lastNode.next = node;
			lastNode = node;
		}
	}
	
	public String dequeue(){
		String item = firstNode.item;
		firstNode = firstNode.next;
		return item;
	}
	
	public boolean isEmpty(){
		return firstNode == null;
	}

}
