
public class LinkedStackQueue {

	
	public static void main(String[] args) {
		Queue queue = new Queue();
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		
		String [] names = {"Daniel", "John", "Chris", "Tyler"}; //Array to hold names
		System.out.println("Adding Names: ");
		
		//for loop to add names to the stack.
		for(String s : names){
			System.out.println(s + " ");
			stack1.push(s);
		}
		System.out.println("_______");
		System.out.println(stack1);
		System.out.println("_______");
		stack1.pop();
		System.out.println(stack1);
		System.out.println("_______");
		/*queue = Stack.reverseStack(stack1);
		System.out.println(queue);
		System.out.println("_______");
		queue.dequeue();
		System.out.println(queue);
		System.out.println("_______");*/
		
		
		
	
		


	}

}
