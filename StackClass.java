// stack using linklist
class StackClass{
  
  public static class Node {
     int data;
     Node next;
    
    Node(int data){
      this.data=data;
      this.next=null;
    }
    
  }
  
  public static class Stack {
    static Node head=null;
    
    public static boolean  isEmpty(){
      return head==null;
    }
    
    //push method is use for inserting values in stack
    public static void push(int data){
      Node newNode = new Node(data);
      if(isEmpty()){
        head = newNode;
        return;
      }
      newNode.next=head;
      head=newNode;
    }
    
    //pop method is use for deleting first element 
    public static int pop(){
      if(isEmpty()){
        return -1;
      }
      int top = head.data;
      head=head.next;
      return top;
    }
    
    //peek method is use for display top element in stack
    public static int peek(){
      if(isEmpty()){
        return -1;
      }
      return head.data;
    }
  }
  
  public static void main(String[]args){
    
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    
    while(stack.isEmpty()!=true){
      System.out.print(stack.peek());
      stack.pop();
    }
  }
}
