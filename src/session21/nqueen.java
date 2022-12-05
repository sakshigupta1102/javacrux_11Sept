package session21;
public class nqueen {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nqueenefficient(board, 0,0, 4, "");
	}
	public static void nqueenefficient(boolean[][] board, int cr, int qpsf , int tq , String ans){
		if(qpsf == tq ){
			
			System.out.println(ans);
			return;
		}
		for(int col=0;col<board.length;col++){
			if(isitsafe(board, cr, col)){
			board[cr][col]=true;
			nqueenefficient(board, cr+1, qpsf+1, tq, ans+ "( " + cr + " - " + col +" )");
			board[cr][col]=false;
			}
		}
		
		
	}
	
	
	
	
	
	public static void nqueen(boolean[][] board,int cr, int cc, int qpsf, int tq, String ans ){
    	if(qpsf == tq){
    		System.out.println(ans);
    		return;
    	}
		
     if(cc == board.length){
    	 cc=0;
    	 cr++;
    	 }
     if(cr==board.length){
    	 return;
     }
		
	if(isitsafe(board,cr,cc)){
		board[cr][cc] = true;
		nqueen(board, cr, cc+1, qpsf+1, tq, ans+ "( " + cr + " - " + cc +" )");
		board[cr][cc] = false;
	}
	nqueen(board, cr, cc+1, qpsf, tq, ans);
		
		
	}
	private static boolean isitsafe(boolean[][] board, int cr, int cc) {
		
		//left
		int row= cr;
		int col = cc-1;
		while(col >= 0){
			if(board[row][col]){
				return false;
			}
			col--;
		}
		
		col= cc;
		row=cr-1;
		while(row>=0){
			if(board[row][col]){
				return false;
			}
			row--;
			
		}
		//diagonally left
		row= cr-1;
		col= cc-1;
		while(row>=0 && col >=0){
			if(board[row][col]){
				return false;
			}
			row--;
			col--;
		}
		
		// diagonally right
		row= cr-1;
		col= cc+1;
		while(row>=0 && col < board.length){
			if(board[row][col]){
				return false;
			}
			row--;
			col++;
		}
		
		return true;
		
		
	}
	
	

}
