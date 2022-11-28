package session20;

public class ratchasescheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board ={ {0,1,0,0 } , {0,0,0,0} , {0,1,0,0} , {0,1,1,0} };
		ratcheese(board, 0, 0,new boolean[board.length][board[0].length], "");

	}
	public static void ratcheese(int[][] board, int cr, int cc, boolean[][] visited, String ans){
		if( cr>= board.length || cr <0 || cc >= board[0].length || cc < 0 || board[cr][cc] == 1 ||
				visited[cr][cc] == true){
			return;
		}
		if(cr == board.length-1  && cc == board[0].length-1){
			System.out.println(ans);
			return;
		}
		visited[cr][cc] = true;
		ratcheese(board, cr+1, cc, visited, ans+"D");
		ratcheese(board, cr, cc+1, visited, ans+"R");
		ratcheese(board, cr, cc-1, visited, ans+"L");
		ratcheese(board, cr-1, cc, visited, ans+"U");
		visited[cr][cc] = false;
		
		
	}

}



