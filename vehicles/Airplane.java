package vehicles;

public class Airplane {
	private int kind;
	private Flying hIF;

	public Airplane(int i) {
		kind = i;
	}

	public Airplane(int i, Flying fly) {
		kind = i;
		hIF = fly;
	}

	public String howDoYouFly() {
		return hIF.howIFLly();
	
	}

	public String howDoYouLiftOff() {
		return hIF.howILliftOff();
	}

}
