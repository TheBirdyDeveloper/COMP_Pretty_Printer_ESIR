package org.xtext.comp.generator;

import org.eclipse.emf.common.command.Command;

public class InstrQuadruplet {

	
	private Command a;
	private	String place;
	private String adresse;
	private String adresse2;
	
	public InstrQuadruplet(Command com, String a, String b, String c) {
		this.a = com;
		place = a;
		adresse = b;
		adresse2 = c;
	}
}
