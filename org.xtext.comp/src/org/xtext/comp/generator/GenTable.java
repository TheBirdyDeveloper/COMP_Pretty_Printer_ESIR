package org.xtext.comp.generator;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.xtext.comp.wh.Affect;
import org.xtext.comp.wh.For;
import org.xtext.comp.wh.Function;
import org.xtext.comp.wh.If;
import org.xtext.comp.wh.Nop;
import org.xtext.comp.wh.While;

public class GenTable {

	SymTable table_m;
	List<String> listFonctions;
	List<Code> funDecl;
	
	public GenTable (SymTable table){
		table_m = table;
		listFonctions=new LinkedList<String>();
		funDecl = new LinkedList<Code>();
		this.initialize();
	}
	
	private void initialize() {
		Iterator<String> ite = table_m.getNames().iterator();
		while(ite.hasNext()){
			String next = ite.next();
			listFonctions.add((String) next); 
			if(table_m.get(next).isFunction())
				funDecl.add(new Code(next, table_m.get(next).nbInput(), table_m.get(next).nbOutput(),table_m.get(next).getCommands()));
		}		
	}

	public String nomsToString(){
		return "\n Generation Table : "+funDecl.toString();
	}
	
	public void chooseCommand() {
		Iterator<Code> ite = funDecl.iterator();
		while(ite.hasNext()) {
			Code next = ite.next();
			if(next instanceof Nop )
			    doA();
			else if(next instanceof Affect)
			    doB();
			else if(next instanceof While)
			    doC();
			else if(next instanceof If)
			    doD();
			else if(next instanceof For)
			    doE():
		}
		
	}
}
