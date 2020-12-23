package deque;

//NOTE THE LINK LIST STRUCTURE IN THIS CODE 
// TAIL . . . . . HEAD
// AND NOT
// HEAD . . . . . TAIL

public class MyDeque<E> {
	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		
		Node<E> toAdd = new Node<>(data);
		if (head == null) {
			head=tail=toAdd;
		}
		else {
			head.next=toAdd;
			toAdd.prev=head;
			head= toAdd;
		}
		
	}
	
	public E removeLast() {
		
		if(head==null) {
			return null;
		}
		Node<E> toRemove = tail;
		tail=tail.next;
		tail.prev= null;
		return toRemove.data;
		
	}
	
	public static class Node<E>{
		E data ;
		Node<E> next, prev;
		
		public Node(E data){
			this.data= data;
			this.next = this.prev = null;
			}
	}

}
