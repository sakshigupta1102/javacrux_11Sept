package session25;

public class Queue {
	
	int[] data;
	int front=0;
	public int size=0;
	
	
	public Queue(){
		this.data = new int[5];
	}
	public Queue(int cap){
		this.data = new int[cap];
	}
	public boolean isfull(){
		return this.data.length == this.size;
	}
	public boolean isEmpty(){
		return  this.size==0;
	}
	public void enqueue(int item) throws Exception{
		if(isfull()){
			throw new Exception("QUEUE IS FULL");
		}
		this.data[(size+front)%data.length] = item;
		this.size++;	
	}
	public int dequeue() throws Exception{
		if(isEmpty()){
			throw new Exception("QUEUE IS empty");
		}
		int val = this.data[this.front];
		this.front = (this.front+1)%this.data.length;
		this.size--;
		return val;
	}
	public int getFront() throws Exception{
		if(isEmpty()){
			throw new Exception("QUEUE IS empty");
		}
		return this.data[this.front];
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<this.size;i++){
			sb.append(this.data[  (front+i )% this.data.length  ]+"   ");
		}
		return sb.toString();
		
	}
	
	public void display(){
		System.out.println("**************");
		for(int i=0;i<this.size;i++){
			System.out.println(this.data[  (front+i )% this.data.length  ]);
		}
		System.out.println("***************");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
