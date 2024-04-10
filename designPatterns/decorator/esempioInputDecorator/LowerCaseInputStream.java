/**
 * @author idabi8 (github)
 * 
 * @since Jun 8, 2023
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

package designPatterns.decorator.esempioInputDecorator;

import java.io.*;

/* FilterInputStream is the abstract decorator for all InputStreams. 
 * LowerCaseInputStream is a concrete decorator.
 * */
public class LowerCaseInputStream extends FilterInputStream {

	/* Implicit super constructor FilterInputStream() is undefined for default constructor. 
	 * Must define an explicit constructor */
	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	/* chiamo il metodo read della superclass (FilterInputStream) il quale:
	 * Reads the next byte of data from this input stream. 
	 * The value byte is returned as an int in the range 0 to 255. 
	 * If no byte is available because the end of the stream has been reached, the value -1 is returned. 
	 * This method blocks until input data is available, the end of the stream is detected, 
	 * or an exception is thrown.
	 * 
	 * This method simply performs in.read() and returns the result.
	 * 
	 * Returns: the next byte of data, or -1 if the end of the stream is reached.
	 * */
	@Override
	public int read() throws IOException {
		
		int c = super.read();	 // in.read();	

		return (c == -1 ? c : Character.toLowerCase((char)c));   		
	}
	
	/*
	 * public int read(byte[] b, int off, int len) throws IOException
	 * 
	 * Reads up to len bytes of data from this input stream into an array of bytes.
	 * If len is not zero, the method blocks until some input is available; otherwise, 
	 * no bytes are read and 0 is returned.
	 *  
	 * This method simply performs in.read(b, off, len) and returns the result.
	 *  
	 * Overrides:  read in class InputStream
	 *  
	 * Parameters:
	 *      b - the buffer into which the data is read.
	 *      off - the start offset in the destination array b
	 *      len - the maximum number of bytes read.
	 *      
	 * Returns: the total number of bytes read into the buffer, 
	 * or -1 if there is no more data because the end of the stream has been reached.
	 * */
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		
		int result = super.read(b, offset, len);
		
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		
		return result;
	}
}
