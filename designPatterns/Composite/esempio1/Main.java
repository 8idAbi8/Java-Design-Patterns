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

package designPatterns.Composite.esempio1;

//Client (esempio di uttilizzo del pattern)
public class Main {

	public static void main(String[] args) {

		// Creazione dei dipendenti
		Employee john = new Developer("John Smith", "Developer");
		Employee jane = new Developer("Jane Doe", "Senior Developer");
		Employee mark = new Developer("Mark Johnson", "Junior Developer");

		// Creazione di un composito che rappresenta un dipartimento
		Team developmentDepartment = new Team("Development Department");
		developmentDepartment.addEmployee(john);
		developmentDepartment.addEmployee(mark);

		// Creazione di un altro composito che rappresenta una squadra di lavoro
		Team projectTeam = new Team("Project Team");
		projectTeam.addEmployee(jane);
		projectTeam.addEmployee(developmentDepartment);

		// Esecuzione della visualizzazione dei dettagli del composito
		projectTeam.showDetails();
	}
	
	/*
	  Livello 0: Project Team
    	Livello 1: Mark Johnson (Junior Developer)
    	Livello 1: Development Department
        	Livello 2: John Smith (Developer)
        	Livello 2: Jane Doe (Senior Developer)
     */
}
