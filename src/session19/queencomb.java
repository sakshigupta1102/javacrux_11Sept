package session19;

public class queencomb {
	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		queencomb(board, 2, 0, "",0);

	}
	public static void queencomb(boolean[] board,int tq,int qpsf, String ans, int lastplaced){
		if(tq == qpsf){
			System.out.println(ans);
			return;
		}
		for(int i= lastplaced ;i<board.length;i++){
			if(board[i] == false){
				board[i] = true; // placing queen
				queencomb(board, tq, qpsf+1, ans+"b" +i + "q" + qpsf, i);
				board[i] = false;   // backtracking removing queen 
				
			}
			
		}
		
		
		
	}


}
