package session47;

public class genericclient {
	public static void main(String[] args) {
		genericsdemo<String, String> gd = new genericsdemo();
		gd.t = "ramu";
		gd.x = "delhi";
		genericsdemo<String, Integer> gd2 = new genericsdemo();
		gd2.t = "ramu";
		gd2.x = 19;

	}
}
