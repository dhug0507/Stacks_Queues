import java. util.*; 
/*
 * Daniel Hug
 * Assignment 4 
 * ICSI 213
 */
public class Queue {
	public Node front = null;
	public Node rear = null;
	
	/**
	 * The method enQueue adds a value
	 * to the queue.
	 * @param s The value to be added to 
	 * the queue
	 */
	public void enQueue(String s){
		if (rear != null){
			rear.next = new Node(s, null);
			rear = rear.next;
		}
		else{
			rear = new Node(s, null);
			front = rear;
		}
	}

}
