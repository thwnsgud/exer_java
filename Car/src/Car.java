
public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("�ڵ����� �޸��ϴ�.");
	}

	public void turnOff() {
		System.out.println("���� ����ϴ�.");
	}

	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
