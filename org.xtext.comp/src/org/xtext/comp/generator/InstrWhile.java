package org.xtext.comp.generator;

import org.xtext.comp.wh.Command;

public class InstrWhile extends Instr {
	
	String codop;
	String varEcriture;
	String varLecture1;
	String varLecture2;
	
	public InstrWhile(Command codop, String var1, String var2, String var3) {
		super(codop, var1, var2, var3);
		this.codop = "While";
		this.varEcriture = "_";
		this.varLecture1 = "_";
		this.varLecture2 = "_";
	}
}
