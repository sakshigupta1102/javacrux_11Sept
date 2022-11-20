package session17;

import java.util.ArrayList;
import java.util.List;

public class lexocount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		lexo(0, 30,list);
		System.out.println(list);
	}

	public static void lexo(int curr, int end,List<Integer> list) {
		if (curr > end) {
			return;
		}
		list.add(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lexo(curr * 10 + i, end,list);
		}
	}

}
