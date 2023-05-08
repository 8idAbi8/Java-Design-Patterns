package designPatterns.singleton;
// both threads return the same singleton object

public class TestDrive {

	public static void main(String[] args) {

		new Thread(() -> {
			Singleton s1 = Singleton.getInstance();
			System.out.println("thread1: " + s1);
		}).start();

		new Thread(() -> {
			Singleton s2 = Singleton.getInstance();
			System.out.println("thread2: " + s2);
		}).start();

		
	}
}
