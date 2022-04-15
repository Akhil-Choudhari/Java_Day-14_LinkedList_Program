package LinkedListProgram;

public class LinkedList<T>{

	Node<T> head;	
	Node<T> current;	
	int position;	
	
	public LinkedList(){
		head = null;
		current = null;
		position = -1;
}

	public void add(T data){
		Node<T> node = new Node<T>(data);
		if(head == null){
			head = node;
			current = head;
		}
		else{
			current.next = node;
			current = current.next;
		}
		position++;
	}
	public void remove(T data){
		Node<T> tempCurrent = head;
		Node<T> tempPrev = null;
		while(!tempCurrent.data.equals(data)){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if(tempCurrent == head){
			head = head.next;
		}
		else{
			tempPrev.next = tempCurrent.next;
		}
		if(tempCurrent == current){
			current = tempPrev;
		}
		position--;
	}
	public boolean search(T data){
		return index(data) == -1 ? false : true; 
	}
	

	public boolean isEmpty(){
		return position == -1 ? true : false;
	}

	
	public int size(){
		return position + 1;
	}
}
