package org.xtext.comp.generator;

import org.xtext.comp.wh.Command;

public class InstrAffect extends Instr {
	String codop;
	String varEcriture;
	String varLecture1;
	String varLecture2;
	public InstrAffect(Command codop, String var1, String var2, String var3) {
		super(codop, var1, var2, var3);
		this.codop = "AFFECT";
		this.varEcriture = "_";
		this.varLecture1 = "_";
		this.varLecture2 = "_";
	}
	
	public String toString(){
		return "<"+this.codop+","+this.varEcriture+","+this.varLecture1+","+this.varLecture2+">";
	}

}
