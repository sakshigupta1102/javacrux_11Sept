package session13;
import java.util.ArrayList;
import java.util.Collections;
public class arraylistdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		list.size();
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		list.add(2,50);
		System.out.println(list);
       list.set(1, 50);
       System.out.println(list);
       System.out.println(list.get(0));
       Collections.sort(list);
       System.out.println(list);
    //   Collections.sort(list,Collections.reverseOrder());
       list.remove(2);
       System.out.println(list);
       
	}

}
