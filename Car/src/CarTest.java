
public class CarTest {
	public static void main(String[] atgs) {
		System.out.println("==============자율주행 하는 자동차 주행==============");
		Car myCar = new GoodCar();
		myCar.run();

		System.out.println("============사람이 운전하는 자동차 =================");
		Car hisCar = new GoodBus();
		hisCar.run();

	}
}
