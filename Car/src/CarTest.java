
public class CarTest {
	public static void main(String[] atgs) {
		System.out.println("==============�������� �ϴ� �ڵ��� ����==============");
		Car myCar = new GoodCar();
		myCar.run();

		System.out.println("============����� �����ϴ� �ڵ��� =================");
		Car hisCar = new GoodBus();
		hisCar.run();

	}
}
