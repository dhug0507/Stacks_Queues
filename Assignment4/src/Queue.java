import java.util.*; 
/*
 * Daniel Hug
 * Assignment 4 
 * ICSI 213
 */
public class Queue {
 private Node front = null;
 private Node rear = null;
 
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
 
 /**
  * The empty method checks if the queue
  * is empty.
  * @return returns true if empty, 
  * false otherwise
  */
 public boolean empty(){
  return front == null;
 }
 
 /**
  * The peek method returns the value at the
  * front of the queue.
  * @return item at the front of the queue.
  * @exception EmptyStackException When the
  * queue is empty.
  */
 public String peek() {
  if (empty())
   throw new EmptyStackException();
  else
   return front.value; 
 }
 
 /**
  * The dequeue method removes and returns
  * the item at the front of the queue.
  * @return item at front of queue.
  * @Exception EmptyStackException When the
  * queue is empty.
  */
 public String dequeue(){
  if (empty())
   throw new EmptyStackException();
  else{
   String value = front.value;
   front = front.next;
   if (front == null) rear = null;
   return value;
  }
 }
  
 /**
  * The toString method concatenates all 
  * Strings in the queue to give a string 
  * representation of the contents of the 
  * queue. 
  * @return string representation of this queue. 
  */
  public String toString() {
   StringBuilder sBuilder = new StringBuilder();
   
   //Walk down the list and append all values.
   Node p = front;
   while (p != null){
    sBuilder.append(p.value + " ");
    p = p.next;
   }
   return sBuilder.toString();
 
  }
 
  
  
  
  
 }











