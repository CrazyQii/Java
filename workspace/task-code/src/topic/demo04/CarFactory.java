package topic.demo04;

public class CarFactory {
	public static Car getCar(String name) {
		if(name.equalsIgnoreCase("BMW")) {	// �����ҪBMW���򴴽�BMW����
			return new BMW();
		} else if(name.equalsIgnoreCase("Benz")) {
			return new Benz();
		} else {
			return null;
		}
	}
}
