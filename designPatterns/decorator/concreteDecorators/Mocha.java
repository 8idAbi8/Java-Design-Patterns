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
 
package designPatterns.decorator.concreteDecorators;

import designPatterns.decorator.abstractComponent.Beverage;
import designPatterns.decorator.abstractDecorator.CondimentDecorator;

/* Visto che CondimentDecorator extends Beverage, allora anche Mocha, 
 * la quale extends CondimentDecorator, extends Beverage. * 
 * Quindi Mocha ha come supertype, sia CondimentDecorator, che (sopratutto) Beverage. * 
 * */
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// abstract method of CondimentDecorator
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	// abstract method of Beverage ( CondimentDecorator extends Beverage)
	@Override
	public double cost() {
		return beverage.cost() + .20;
	}
}
