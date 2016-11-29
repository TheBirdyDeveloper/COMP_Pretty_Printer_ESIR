package org.xtext.comp.generator;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.xtext.comp.wh.ExprSimple;
import org.xtext.comp.wh.Function;
import org.xtext.comp.wh.Input;
import org.xtext.comp.wh.Output;
import org.xtext.comp.wh.Program;

public class FunctionEnvironment {

	HashMap<String,Integer> variableList;
	int nbInput;
	int nbOutput;
	String name;
	int nbOccur;

	public FunctionEnvironment(Function f, String name){
		this.variableList = new HashMap<String,Integer>();
		this.nbInput = 0;
		this.nbOutput = 0;
		this.createVariableList(f);
		this.name= name;



	}
	public FunctionEnvironment(ExprSimple s){
		this.nbOccur = 0;
	}

	public void createVariableList(Function f){
		EList<String> varListInput = null;
		if((f.getDefinition().getInput().getVars().size()>0)){
			varListInput = (f.getDefinition().getInput().getVars());
			for(int i = 0; i<(varListInput.size()); i++){
				String varName = varListInput.get(i);
				if(!(variableList.containsKey(varName))){
					System.out.println("L'input "+nbInput+" est : "+varName);
					variableList.put(varName, 0);
					nbInput++;
				}else{
					throw new Error("Cette variable existe déja");
				}
			}
		}
		EList<String> varListOutput = null;
		if((f.getDefinition().getOutput().getVars().size()>0)){
			varListOutput = (f.getDefinition().getOutput().getVars());
			for(int i = 0; i<(varListOutput.size()); i++){
				String varName = varListOutput.get(i);
				if(variableList.containsKey(varName)){
					System.out.println("L'output "+nbOutput+" est : "+varName);
					nbOutput++;
				}else{
					throw new Error("Cette variable n'a pas été définie"); // Ou simplement l'ajouter à nil
					//variableList.put(varName, null);
				}
			}
		}
	}

	public void setNbOccur(int occur){
		this.nbOccur=occur;
	}

	public String toString(){
		return variableList.toString();
	}


}
