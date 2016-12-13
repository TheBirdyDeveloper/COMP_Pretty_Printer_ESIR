package org.xtext.comp.generator;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.comp.wh.Affect;
import org.xtext.comp.wh.Command;
import org.xtext.comp.wh.Commands;
import org.xtext.comp.wh.For;
import org.xtext.comp.wh.Function;
import org.xtext.comp.wh.If;
import org.xtext.comp.wh.Nop;
import org.xtext.comp.wh.While;

public class GenTable {

	SymTable table_m;
	List<String> listFonctions;
	List<Code> funDecl;
	HashMap<String,List<Instr>> listCode3Adr;
	
	GenTable (SymTable table){
		table_m = table;
		listFonctions=new LinkedList<String>();
		funDecl = new LinkedList<Code>();
		listCode3Adr = new HashMap<String,List<Instr>>();
		this.initialize();
		this.parseFunDecl();
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
		return "\n Liste de codes (nom, inputs, outputs, code) : "+funDecl.size()+"\n"+funDecl.toString()
				+"\n\nCode 3 adresses : "+listCode3Adr.size()+"\n"+listCode3Adr.toString();
	}
	
	/*
	 * Fonction qui parcourir la liste de Code et appelle la méthode chooseCommand pour chaque "Commands" (aka chaque code de fonction)
	 */
	public void parseFunDecl(){
		//On crée un itérateur sur les "Code" -> On récupère les "Commands" de chaque fonction
		Iterator<Code> ite = funDecl.iterator();
		while(ite.hasNext()) {
			Code nextCode = ite.next();
			//On récupère les "Command" du "Commands" originel (celui de la fonction)
			EList<Command> commands = ((Commands)nextCode.getCode()).getCommands();
			this.createInstr(nextCode.getName(),commands,null);
		}
	}
	
	public void createInstr(String name,EList<Command> listCommands, List<Instr> code3Adr) {
		if(code3Adr==null)	
			code3Adr = new LinkedList<Instr>();
		
		this.parseCommands(listCommands, code3Adr);
			
		listCode3Adr.put(name, code3Adr);
	}
	
	public void parseCommands(EList<Command> listCommands, List<Instr> code3Adr){
		
		EList<Command> tmpCommands = listCommands;
		//On crée un itérateur sur les "Commands" de chaque fonction -> On récupère les "Command" de chaque "Commands"
		Iterator<Command> iteC = tmpCommands.iterator();
		while(iteC.hasNext()){
			Command nextCommand = iteC.next();
			if((nextCommand.getCmd()) instanceof Nop){
			    code3Adr.add(new InstrNop(null, null, null, null));
			}
			else if(nextCommand.getCmd() instanceof Affect){
				code3Adr.add(new InstrAffect(null, null, null, null));		
			}
			else if(nextCommand.getCmd() instanceof While){
				code3Adr.add(new InstrWhile(null, null, null, null));
			}
			else if(nextCommand.getCmd() instanceof If){
				code3Adr.add(new InstrIf(null, null, null, null));
				this.parseCommands( ((If) nextCommand.getCmd()).getCommands1().getCommands(),code3Adr );
			    this.parseCommands( ((If) nextCommand.getCmd()).getCommands2().getCommands(),code3Adr );
			}    
			else if(nextCommand.getCmd() instanceof For){
				
			}
		}
		
	}
		
	}

