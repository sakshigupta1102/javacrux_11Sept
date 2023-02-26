package session43;

import java.util.HashMap;

public class trie {
	public class Node {
		char ch;
		HashMap<Character, Node> children = new HashMap();
		boolean isterminal ;
		Node(char ch){
			this.ch= ch;
			this.isterminal = false;
		}

	}
	public Node root;
	trie(){
		Node nn = new Node('*');
		root = nn;
		
	}
	public void insert(String str){
		Node curr = this.root;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(curr.children.containsKey(ch)){
				curr = curr.children.get(ch);
			}
			else{
				Node nn = new Node(ch);
				curr.children.put(ch, nn);
				curr = nn;
				
			}
			
		}
		curr.isterminal = true;
		
		
	}
	
	public boolean search(String str){
		Node curr = this.root;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(curr.children.containsKey(ch)){
				curr = curr.children.get(ch);
			}
			else{
				return false;
			}
			
		}
		return curr.isterminal;
		
		
		
	}
	public boolean startswith(String str){
		Node curr = this.root;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(curr.children.containsKey(ch)){
				curr = curr.children.get(ch);
			}
			else{
				return false;
			}
			
		}
		return true;
		
		
	}
	
	
	
	
}
