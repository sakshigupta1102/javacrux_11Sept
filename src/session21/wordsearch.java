package session21;

public class wordsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean exist(char[][] board, String word) {
	        boolean[][] visited= new boolean[board.length][board[0].length];
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[0].length;j++){
	                if(word.charAt(0) == board[i][j]){
	                    boolean ans= wordsearch(board,visited,i,j,word,0);
	                    if(ans) return true;
	                }

	            }
	        }
	        return false;
	        
	    }
	 public boolean wordsearch(char[][] board, boolean[][] visited, int cr , int cc, String word, int idx){
	        
		    if(idx==word.length()){
		        return true;
		    }    
		    if(cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length || visited[cr][cc] == true || board[cr][cc] != word.charAt(idx)){
		        return false;
		    }
		    
		    visited[cr][cc] = true;
		        boolean left=wordsearch(board, visited, cr, cc -1,word,idx+1);
		        boolean right =wordsearch(board, visited, cr, cc +1,word,idx+1);
		        boolean up =wordsearch(board, visited, cr-1, cc,word,idx+1);
		        boolean down = wordsearch(board, visited, cr+1, cc,word,idx+1);
		        if(left|| right ||up || down){
		            return true;
		        }
		        
		        visited[cr][cc] = false;
		        return false;       
		        
		        
		    }
		    

}
