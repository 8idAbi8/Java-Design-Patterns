/**
 * @author idabi8 (github)
 * 
 * @since Jun 21, 2023
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

package designPatterns.Composite.esempio2;

//Classe client che utilizza la struttura gerarchica di componenti
public class Main {
	
	public static void main(String[] args) {
		// Creazione degli elementi dell'albero
		Component leaf1 = new Leaf("Leaf 1");
		Component leaf2 = new Leaf("Leaf 2");

		// Creazione del composito radice
		Composite root = new Composite("root");

		// Aggiunta delle foglie al composito radice
		root.addComponent(leaf1);
		root.addComponent(leaf2);

		// Creazione di un composito figlio
		Composite child = new Composite("child");

		// Creazione di una foglia figlia
		Component leaf3 = new Leaf("Leaf 3");

		// Aggiunta della foglia figlia al composito figlio
		child.addComponent(leaf3);

		// Aggiunta del composito figlio al composito radice
		root.addComponent(child);

		// Esecuzione dell'operazione su tutta la struttura gerarchica
		root.operation();
	}
	
	/*
	 * Root (Livello 0)
    	Leaf 1 (Livello 1)
    	Leaf 2 (Livello 1)
    	Child (Livello 1)
        	Leaf 3 (Livello 2) 
	 * */
}
