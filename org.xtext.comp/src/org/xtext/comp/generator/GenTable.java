package org.xtext.comp.generator;


import java.util.LinkedList;
import java.util.List;

public class GenTable {

	SymTable table_m;
	List<String> listFonctions;
	
	public GenTable (SymTable table){
		table_m = table;
		listFonctions=new LinkedList();
		this.getNomsFonctions();
	}
	
	public String nomsToString(){
		return listFonctions.toString();
	}
	
	public void getNomsFonctions(){
		
	}
	
}
