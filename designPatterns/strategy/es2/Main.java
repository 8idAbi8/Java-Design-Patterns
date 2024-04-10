/**
 * @author idabi8 (github)
 * 
 * @since Jun 22, 2023
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

package designPatterns.strategy.es2;

import java.util.Arrays;

// esempio di utilizzo del pattern Strategy
public class Main {
	
	public static void main(String[] args) {
		
		// Context
		ArraySorter arraySorter = new ArraySorter();		
		
		int n = 500; // nr elementi array
		int[] array = new int[n];		
		for(int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		
		
		int iterazioni = 10000; // nr di sort	
		
		// Utilizzo del BubbleSort (concrete Strategy)
		arraySorter.setSortingStrategy(new BubbleSort());		
		for(int i = 0; i < iterazioni; i++) 
			arraySorter.sortArray(array);
		
		System.out.println("Avarage Execution time for BubbleSort : " + (BubbleSort.executionTime/iterazioni) + " nanoseconds");
//		System.out.println("Sorted array: " + Arrays.toString(array));

		
		// Utilizzo del QuickSort (concrete Strategy)
		arraySorter.setSortingStrategy(new QuickSort());		
		for(int i = 0; i < iterazioni; i++)
			arraySorter.sortArray(array);
		
		System.out.println("Avarage Execution time for QuickSort: " + (QuickSort.executionTime/iterazioni) + " nanoseconds");
//		System.out.println("Sorted array: " + Arrays.toString(array));
	}
}