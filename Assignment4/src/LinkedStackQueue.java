
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
		
		queue = Stack.stackToQueue(stack1);
		System.out.println("The contents of Queue: ");
		System.out.println(queue);
		System.out.println("_______");

		
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
		
		stack2 = Stack.stackToStack(stack1);
		System.out.println("The contents of Stack 2: ");
		System.out.println(stack2);
		
		stack3 = Queue.queueToStack(queue);
		System.out.println("_______");
		System.out.println("The contents of Stack 3: ");
		System.out.println(stack3);
		System.out.println("_______");
		
		
		
		
		
		
	
		


	}

}
