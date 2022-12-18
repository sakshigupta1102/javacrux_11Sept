package session25;

public class DynamicQueue extends Queue{
	
	@Override
	public void enqueue(int item) throws Exception{
		if(super.isfull()){
			int[] arr = new int[super.data.length *2];
			for(int i=0;i<super.data.length ;i++){
				arr[i] = super.data[(front+i)% super.data.length];
			}
			
			super.data = arr;
			super.front=0;
		}
		super.enqueue(item);
	
	}
	
	
	

}
