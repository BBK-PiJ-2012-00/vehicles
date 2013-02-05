package vehicles;

public class Airplane {
	private int kind;
	private FFJ hIF;

	public Airplane(int i) {
		kind = i;
	}

	public Airplane(int i, FFJ fly) {
		kind = i;
		hIF = fly;
	}

	public String howDoYouFly() {
		return hIF.howIFLly();
	
	}

	public String howDoYouLiftOff() {
		switch (kind) {
		case 1: return "Vertically";
		case 2: return "I lift off";
		case 3: return "Horizontally";
		default: return null;
		}
	}

}
