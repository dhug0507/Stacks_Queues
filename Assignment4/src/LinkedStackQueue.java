
public class LinkedStackQueue {

	
	public static void main(String[] args) {
		Queue queue = new Queue();
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		Stack stack3 = new Stack();
		
		String [] names = {"Daniel", "John", "Chris", "Tyler"}; //Array to hold names
		System.out.println("Adding Names: ");
		
		//for loop to add names to the stack.
		for(String s : names){
			System.out.print(s + " ");
			stack1.push(s);
		}
		
		System.out.println();
		System.out.println("_______");
		System.out.println("The contents of Stack 1: ");
		System.out.println(stack1);
		System.out.println("_______");
		
		/*
		 * Copies the contents of stack1 to
		 * queue while maintaining order.
		 */
		queue = Stack.stackToQueue(stack1);
		System.out.println("The contents of Queue: ");
		System.out.println(queue);
		System.out.println("_______");

		/*
		 * Adding the array names back to stack1
		 */
		System.out.print("Adding Names: ");
		for(String s : names){
			System.out.print(s + " ");
			stack1.push(s);
		}
		System.out.println();
		System.out.println("_______");
		System.out.println("The contents of Stack 1: ");
		System.out.println(stack1);
		System.out.println("_______");
		
		/*
		 * Copies the contents of stack1 to stack2
		 * while maintaining order.
		 */
		stack2 = Stack.stackToStack(stack1);
		System.out.println("The contents of Stack 2: ");
		System.out.println(stack2);
		
		/*
		 * Copies the contents of a queue to
		 * a stack while maintaining order.
		 */
		stack3 = Queue.queueToStack(queue);
		System.out.println("_______");
		System.out.println("The contents of Stack 3: ");
		System.out.println(stack3);
		System.out.println("_______");
		
		/*
		 * Testing my deQueue and enQueue 
		 * methods
		 */
		queue.enQueue("Judah");
		queue.enQueue("Tom");
		queue.enQueue("Dan");
		System.out.println("The contents of Queue: ");
		System.out.println(queue);
		System.out.println("_______");
		queue.deQueue();
		System.out.println("The contents of Queue: ");
		System.out.println(queue);
		System.out.println("_______");
	
		
		/*
		 * Testing my push and pop methods
		 */
		stack1.push("Gabe");
		stack1.push("Bobby");
		stack1.push("Martin");
		stack1.push("Johnny");
		System.out.println("The contents of Stack 1: ");
		System.out.println(stack1);
		System.out.println("_______");
		stack1.pop();
		System.out.println("The contents of Stack 1: ");
		System.out.println(stack1);
		System.out.println("_______");
		
	
		
		
		
		
		
		
		
		
	
		


	}

}
