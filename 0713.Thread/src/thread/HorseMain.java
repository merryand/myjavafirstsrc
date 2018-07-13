package thread;

public class HorseMain {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		Horse h4 = new Horse();
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();

	}

}
