package session24;

public class Stack {
	
	protected int[] data;
	private int top;
	public Stack(){
		this.data = new int[5];
		this.top=0;
		
	}
	public Stack(int cap ){
		this.data = new int[cap];
		this.top=0;
	}
	public boolean isEmpty(){
		return top==0;
//		if(top == 0) return true;
//		return false;
	}
	public boolean isFull(){
		return top==this.data.length;
	}
	public void push(int item) throws Exception{
		if(isFull()){
			throw new Exception("stack is full");
		}
		this.data[this.top] = item;
		this.top++;
	}
	public int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("Stack is empty");
		}
		this.top--;
		return this.data[this.top];
	}
	public int peek() throws Exception{
		if(isEmpty()){
			throw new Exception("Stack is empty");
		}
		return this.data[this.top-1];
	}
	public int size(){
		return this.top;
	}
	public void display(){
		System.out.println("*******************************");
		for(int i=top-1 ;i >=0 ;i--){
			System.out.println(this.data[i]);
		}
		System.out.println("********************************");
	}
	
	
	
	
	
	

}
