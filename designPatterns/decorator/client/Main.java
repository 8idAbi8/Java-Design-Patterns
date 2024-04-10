/**
 * @author idabi8 (github)
 * 
 * @since Jun 7, 2023
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

package designPatterns.decorator.client;

import designPatterns.decorator.abstractComponent.Beverage;
import designPatterns.decorator.concreteComponents.DarkRoast;
import designPatterns.decorator.concreteComponents.Espresso;
import designPatterns.decorator.concreteComponents.HouseBlend;
import designPatterns.decorator.concreteDecorators.Mocha;
import designPatterns.decorator.concreteDecorators.Soy;
import designPatterns.decorator.concreteDecorators.Whip;

public class Main {
	public static void main(String[] args) {

		// abstract component  -  concrete component
		Beverage beverage = new Espresso();		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());		

		Beverage beverage2 = new DarkRoast();		
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);  
		beverage2 = new Whip(beverage2);		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());		

		Beverage beverage3 = new HouseBlend();		
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);		
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}

