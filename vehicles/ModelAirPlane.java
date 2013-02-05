package vehicles;

public class ModelAirPlane implements Flying {

	@Override
	public String howIFLly() {
		return "I don't fly";
	}

	@Override
	public String howILliftOff() {
		return "I don't take off";
	}

}
