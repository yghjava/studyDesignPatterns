package chapter26_day01.sum;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setCurrentState(new ConcreteState1());
		context.handle1();
		context.handle2();
	}
}
