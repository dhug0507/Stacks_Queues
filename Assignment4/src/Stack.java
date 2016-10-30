import java. util.*; 
/*
 * Daniel Hug
 * Assignment 4 
 * ICSI 213
 * This program is for a stack based on a linked list.
 */
public class Stack {
	public Node top = null; //Top of the stack.
	
	/**
	 * The empty method checks for an empty stack.
	 * @return returns true if the stack is empty, 
	 * and false otherwise
	 */
	public boolean empty(){
		return top == null;
		
	}
	
	/**
	 * The push method adds a new item to the top of 
	 * the stack.
	 * @param s The item to be pushed to the
	 *  top of the stack.
	 */
	public void push(String s){
		top = new Node(s, top);
	}
	
	/**
	 * The pop method removes the value at the
	 *  top of stack.
	 *  @return The value at the top of the stack
	 *  @exception EmptyStackException When the 
	 *  stack is empty.
	 */
	
	public String pop(){
		if(empty())
			throw new EmptyStackException();
		else{
			String retValue = top.value;
			top = top.next;
			return retValue;
		}
	}
	
	/**
	 * The peek method returns the value at the top
	 * of the stack.
	 * @return The value at the top of the stack
	 * @exception EmptyStackException When the
	 * stack is empty. 
	 */
	public String peek(){
		if(empty())
			throw new EmptyStackException();
		else 
			return top.value;
	}
	
	/**
	 * The toString method computes a string
	 * representation of the contents of the stack.
	 * @return The string representation of the stack
	 * contents.
	 */
	
	public String toString(){
		StringBuilder sBuilder = new StringBuilder();
		Node p = top;
		while(p != null){
			sBuilder.append(p.value);
			p = p.next;
			if (p != null)
				sBuilder.append("\n");
		}
			return sBuilder.toString();
	}

}

	
	
	
	
	
	
	
	
	
	