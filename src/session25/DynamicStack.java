package session25;

import session24.Stack;

public class DynamicStack extends  Stack {
	
	@Override
	public void push(int item) throws Exception{
		if(super.isFull()){
			int[] arr = new int[super.data.length *2];
			for(int i=0;i<super.data.length;i++){
				arr[i] = super.data[i];
			}
			super.data = arr;
			
		}
		super.push(item);
		
		
	}

}
