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
		if(empty())//Checks if empty
			throw new EmptyStackException();
		else{
			String retValue = top.value; //Stores the current top in retValue
			top = top.next; //changes the top of the stack to the next in line
			return retValue; //returns the value that got removed
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
			//returns the top of the stack.
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
	

	/**
	 * The stackToQueue method copies the contents of 
	 * a stack to a queue
	 * @param stack
	 * @return q the queue that added the contents of
	 * the stack
	 */
	public static Queue stackToQueue(Stack stack){
		Stack reverse = new Stack();
		Queue q = new Queue();
		while(!stack.empty()){
			//reverses the stack and adds it to another stack
			reverse.push(stack.pop());
			//adds the contents of the stack reverse to a queue
			q.enQueue(reverse.pop()); 
			
		}
		return q;
	}
	
	/**
	 * The stackToStack method copies the
	 * contents of a stack to another stack.
	 * @param stack
	 * @return stackTwo the copy of the original stack.
	 */
	public static Stack stackToStack(Stack stack){
		Stack stackTwo = new Stack();
		Stack stackTemp = new Stack();
		
		//Pushes the values of the original stack into
		//a temporary stack in reverse order.
		while(!stack.empty()){
			stackTemp.push(stack.pop());
			
		}
		//Pushes the values of the temporary stack
		//into the second stack.
		while(!stackTemp.empty()){
			stackTwo.push(stackTemp.pop());
		}
		//returns the second stack
		return stackTwo;
	}

}

	
	
	
	
	
	
	
	
	
	