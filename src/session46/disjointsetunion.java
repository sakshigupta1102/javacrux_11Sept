package session46;
import java.util.HashMap;
public class disjointsetunion {
	class Node{
		int val;
		Node parent;
		int rank;
	}
	HashMap<Integer,Node> map = new HashMap();
	public void createset(int v){
		Node nn = new Node();
		nn.val = v;
		nn.parent= nn;
		nn.rank= 0;
		map.put(v, nn);
	}
	public int find(int v){
		Node nn = map.get(v);
		Node ans = find(nn);
		return ans.val;
	}
	public Node find(Node nn){
		if(nn.parent==nn){
			return nn;
		}
		Node n = find(nn.parent);
	   return n;
	}
	public void union(int v1, int v2){
		Node n1 = map.get(v1);
		Node n2 = map.get(v2);
		Node rn1 = find(n1);
		Node rn2 = find(n2);
		if(rn1.rank == rn2.rank){
			rn1.parent = rn2;
			rn2.rank = rn2.rank+1;
		}
		else if(rn1.rank > rn2.rank){
			rn2.parent= rn1;
		}else{
			rn1.parent= rn2;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
