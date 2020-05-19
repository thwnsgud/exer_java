
public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("자동차가 달립니다.");
	}

	public void turnOff() {
		System.out.println("차가 멈춥니다.");
	}

	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
