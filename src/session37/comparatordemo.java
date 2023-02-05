package session37;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class comparatordemo {

	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList();
		list.add(new Car("thar", 700, 2012));
		list.add(new Car("maruti", 900, 2012));
		list.add(new Car("creta", 600, 2018));
		list.add(new Car("swift", 600, 2012));
		System.out.println(list);
		Collections.sort(list , new carcomp());
		System.out.println(list);
	}
}

class Car {
	String name;
	int price;
	int yom;

	public Car(String name, int price, int yom) {
		this.name = name;
		this.price = price;
		this.yom = yom;
	}

	@Override
	public String toString() {
		return "{ " + this.name + " " + this.price + " " + this.yom + "  }";
	}

}

class carcomp implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		if (o1.price < o2.price) return -1;
		else if(o1.price > o2.price) return 1;
		else if(o1.yom < o2.yom ) return -1;
		return 1;
	}

}
