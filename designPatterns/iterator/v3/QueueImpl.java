/**
 * @author idabi8 (github)
 * 
 * @since Jun 12, 2023
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

package designPatterns.iterator.v3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueImpl implements Queue {

	private Object[] elements;
	private int size;
	private int front;
    private int rear;

	public QueueImpl() {
		elements = new Object[10];
		size = 0;
		front = 0;
		rear = -1;
	}

	// metodi di Queue
	@Override
	public void add(Object value) {
		
		if (size == elements.length) {
            // Queue is full, resize the array
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        rear = (rear + 1) % elements.length;
        elements[rear] = value;
        size++;
		
	}

	@Override
	public Object remove() throws IllegalStateException {
		
		if (size <= 0) {
            throw new IllegalStateException("Queue is empty");
        }

        Object value = elements[front];
        front = (front + 1) % elements.length;
        size--;

        return value;
	}


	// metodo derivato dall'estensione di Iterable<T>
	@Override
	public Iterator<Object> iterator() {  // create Iterator()
		return new QueueIterator();
	}


	private class QueueIterator implements Iterator {

		private int currentIndex;

		public QueueIterator() {
			currentIndex = front;
		}

		public boolean hasNext() {
			return currentIndex != rear + 1;
		}

		public Object next() throws NoSuchElementException {
			if (!hasNext()) {
				throw new NoSuchElementException("No more elements in the queue");
			}

			Object value = elements[currentIndex];
			currentIndex = (currentIndex + 1) % elements.length;

			return value;
		}
	}
}
