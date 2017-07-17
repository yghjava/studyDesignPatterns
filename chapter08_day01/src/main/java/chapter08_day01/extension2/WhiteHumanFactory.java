package chapter08_day01.extension2;

public class WhiteHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		
		return new WhiteHuman();
	}

	
}
