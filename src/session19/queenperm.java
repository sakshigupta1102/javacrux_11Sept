package session19;

public class queenperm {

	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		queenperm(board, 2, 0, "");

	}
	public static void queenperm(boolean[] board,int tq,int qpsf, String ans){
		if(tq == qpsf){
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++){
			if(board[i] == false){
				board[i] = true; // placing queen
				queenperm(board, tq, qpsf+1, ans+"b" +i + "q" + qpsf);
				board[i] = false;   // backtracking removing queen 
				
			}
			
		}
		
		
		
	}

}
