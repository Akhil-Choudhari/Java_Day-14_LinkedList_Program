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
}