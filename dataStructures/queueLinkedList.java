
public class queueLinkedList<Item> {
	private Node firstNode = null;
	private Node lastNode = null;
	private int i = 0;
	private class Node{
		Item item;
		Node next;
	}
	
	public void enqueue(Item element){
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
	
	public Item dequeue(){
		Item item = firstNode.item;
		firstNode = firstNode.next;
		return item;
	}
	
	public boolean isEmpty(){
		return firstNode == null;
	}

}
