package org.xtext.comp.generator;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.xtext.comp.wh.Function;
import org.xtext.comp.wh.Input;
import org.xtext.comp.wh.Output;
import org.xtext.comp.wh.Program;

public class FunctionEnvironment {

	HashMap<String,Integer> variableList;
	int cpt;
	
	public FunctionEnvironment(Function f){
		this.variableList = new HashMap<String,Integer>();
		this.createVariableList(f);
		this.cpt = 0;
	}
	
	public void createVariableList(Function f){
		EList<String> varList = null;
		String varName = "";
		if((f.getDefinition().getInput().getVars().size()>0)){
			varList = (f.getDefinition().getInput().getVars());
			for(int i = 0; i<(varList.size()); i++){
				varName = varList.get(i);
				if(!(variableList.containsKey(varName))){
					System.out.println(varName);
					variableList.put(varName, cpt);
					cpt++;
				}else{
					//Throw erreur variable en double
				}
			}
		}
	}

	
	public String toString(){
		return variableList.toString();
	}
	
	
}
