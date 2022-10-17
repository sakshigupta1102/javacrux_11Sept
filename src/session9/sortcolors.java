package session9;

public class sortcolors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void sortColors(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int k=0;
        while(k<=j){
            if(arr[k]==0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;

            }
            else if(arr[k]==1){
                k++;

            }
            else{
                int temp =arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;

            }
        }
    }

}
