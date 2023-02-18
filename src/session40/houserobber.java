package session40;

public class houserobber {
	public static void main(String[] args) {
		int[] arr = {5,2,1,11};
		System.out.println(houserobber(arr, 0));
	}

	public static int houserobber(int[] arr, int i) {
		if (i >= arr.length)
			return 0;

		int rob = arr[i] + houserobber(arr, i + 2);
		int dontrob = houserobber(arr, i + 1);
		return Math.max(rob, dontrob);

	}
	 public  int houserobberTD(int[] arr, int i, int[] strg) {
			if (i >= arr.length)
				return 0;
	        if(strg[i] != -1) return strg[i];
			int rob = arr[i] + houserobberTD(arr, i + 2,strg);
			int dontrob = houserobberTD(arr, i + 1,strg);
			return strg[i] = Math.max(rob, dontrob);

		}
	 
	 public static int houserobberBU(int[] arr){
		 int[] strg = new int[arr.length];
		 strg[0] = arr[0];
		 strg[1] = Math.max(arr[0],arr[1]);
		 for(int i=2;i<strg.length;i++){
			 int rob = arr[i] +strg[i-2];
			 int dontrob = strg[i-1];
			 strg[i] = Math.max(rob, dontrob);
		 }
		 return strg[strg.length-1];
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
