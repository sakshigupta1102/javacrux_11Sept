package session21;

public class mergetwosortedarray {

	public static void main(String[] args) {
		int[] arr1 = {4,5,8,10};
		int[] arr2 ={6,9,12,18,64,89,100};
		int[] ans = mergetwoarrays(arr1, arr2);
		for (int a : ans) {
			System.out.print(a+" ");
	}
	}
	public static int[] mergetwoarrays(int[] arr1, int[] arr2){
		int[] ans = new int[arr1.length+ arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j < arr2.length){
		 if(arr1[i] < arr2[j]){
			 ans[k] = arr1[i];
			 i++;
			 k++;
		 }
		 else{
			 ans[k] = arr2[j];
			 k++;
			 j++;
		 }
		}
		while(i < arr1.length){
		  ans[k] = arr1[i];
		  i++;
		  k++;
		  
		}
		while(j < arr2.length){
			  ans[k] = arr2[j];
			  j++;
			  k++;
			  
			}
		
		
		return ans;
	}
	
	
	

}
