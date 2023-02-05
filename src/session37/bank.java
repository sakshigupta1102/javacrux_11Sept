package session37;

public class bank implements bankinterface,bank2interface {

	@Override
	public int rateofinterest() {
		return 0;
	}

	@Override
	public boolean cangetloan(int assets, int shareprice) {
		return false;
	}
	

}
