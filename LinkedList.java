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
}