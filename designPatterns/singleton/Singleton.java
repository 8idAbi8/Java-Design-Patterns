package designPatterns.singleton;

/**
 * @author idabi8 (github)
 * 
 * @since Jun 4, 2023
 *
 * This project is licensed under the MIT license.
 *
 * The MIT License
 * Copyright © 2023 Idlir Abilaliaj
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */


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
