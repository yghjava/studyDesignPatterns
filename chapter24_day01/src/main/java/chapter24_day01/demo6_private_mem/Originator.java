package chapter24_day01.demo6_private_mem;

/**
 * The class need to backup
 * 
 * @author ygh Jul 28, 2017
 */
public class Originator {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void changeState() {
		this.state = "心情不好";
	}

	public Memento createMemeoto() {
		return new Memento(this.getState());
	}

	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}

	private class Memento implements IMemento {
		private String state;

		public Memento(String state) {
			super();
			this.state = state;
		}

		public String getState() {
			return state;
		}

		@SuppressWarnings("unused")
		public void setState(String state) {
			this.state = state;
		}

	}
}
