package designPatterns.singleton;

/*
 * With double-checked locking approach for creating a singleton instance, 
 * we first check to see if an instance is created, and if not, THEN we synchronize. 
 * This way, we only synchronize the first time the instance is created, 
 * and subsequent calls to getInstance() do not require synchronization.
 * */

public class Singleton {

	/* The volatile keyword ensures that multiple threads handle the instance variable correctly 
	when it	is being initialized to the Singleton instance.*/
	private volatile static Singleton instance = null;

	private Singleton() {
		
		// to prevent instantiating by Reflection call
	    if (instance != null) {
	      throw new IllegalStateException("Already initialized.");
	    }
	    
	    /*
	     * Reflection is a powerful tool that can be used to dynamically create new objects, 
	     * call methods, and access fields, but it can also be misused to bypass access control 
	     * mechanisms or to create multiple instances of a singleton class.
	     * 
	     * In the context of singleton instance creation, if a singleton class does not enforce 
	     * a single instance by throwing an exception or returning a pre-existing instance, 
	     * an attacker can potentially create multiple instances of the singleton class 
	     * by using Reflection to access the private constructor and invoking it multiple times.
	     * 
	     * To prevent this, we check if the singleton class has already been created. 
	     * If an instance exists, it throws an IllegalStateException to prevent further initialization.
	     * */
	    
		
//		System.out.println("Singleton");
	}

	public static Singleton getInstance() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		
		return instance;		
	}
}
