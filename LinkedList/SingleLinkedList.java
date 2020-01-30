package LinkedList;

public class SingleLinkedList {
	public SingleNode head;
	public SingleNode tail;
	public int size;
	
	public SingleNode createSingleLinkedList(int nodeValue){
		 head = new SingleNode();
		 SingleNode node = new SingleNode();
		 node.setValue(nodeValue);
		 node.setNext(null);
		 head = node;
		 tail = node;
		 size = 1;
		 return head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertInLinkedList(int nodeValue, int location){
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		if(!existsLinkedList()){
			System.out.println("Linked list does not exist");
		} else if(location == 0){
			node.setNext(head);
			head = node;
		} else if(location >= size){
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		} else {
			SingleNode tempNode = head;
			int index = 0;
			while(index < location-1){
				tempNode = tempNode.getNext();
				index++;
			}
			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}
		setSize(getSize()+1);
	}

	private boolean existsLinkedList() {
		// TODO Auto-generated method stub
		return head != null;
	}
	
	void traverseLinkedList(){
		if(existsLinkedList()){
			SingleNode tempNode = head;
			for(int i = 0; i < getSize(); i++){
				System.out.print(tempNode.getValue());
				if( i != getSize() - 1){
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
		} else {
			System.out.println("Linked List does not exist");
		}
		System.out.println("\n");
	}
	
	void deleteLinkedList(){
		System.out.println("\n Deleting linked list");
		head = null;
		tail = null;
		System.out.println("\n Linked list deleted successfully");
	}
	
	boolean searchNode(int nodeValue) {
		if(existsLinkedList()){
			SingleNode tempNode = head;
			for(int i = 0; i < getSize(); i++){
				if(tempNode.getValue() == nodeValue){
					System.out.println("Value found at location " + i + "\n");
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.println("Node not found!! \n");
		return false;
	}
	
	public void deletionOfNode(int location){
		if(!existsLinkedList()){
			System.out.println("Linked list does not exist!!");
		} else if(location == 0) {
			head = head.getNext();
			setSize(getSize()-1);
			if(getSize() == 0){
				tail = null;
			}
		} else if(location >= getSize()){
			SingleNode tempNode = head;
			for(int i = 0; i < getSize() - 1; i++){
				tempNode = tempNode.getNext();
			}
			if(tempNode == head){
				tail = head = null;
				setSize(getSize() - 1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);
		} else {
			SingleNode tempNode = head;
			for(int i = 0; i < location - 1; i++){
				tempNode = tempNode.getNext();
			}
			
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(getSize() - 1);
		}
	}
}
