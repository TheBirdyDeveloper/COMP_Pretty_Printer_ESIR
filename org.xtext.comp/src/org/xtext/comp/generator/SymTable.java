package org.xtext.comp.generator;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.validation.IResourceValidator;
import org.xtext.comp.wh.*;
import org.xtext.comp.wh.impl.ProgramImpl;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SymTable {


	TreeIterator<EObject> tree;
	TreeIterator<EObject> treeF;
	HashMap<String,FunctionEnvironment> functionMap;
	
	public SymTable(Resource resource){
		this.tree = resource.getAllContents().next().eAllContents();
		this.functionMap = new HashMap<String,FunctionEnvironment>();		
		this.createFunctionMap();
		this.functionMap.toString();
	}
	
	public void createFunctionMap(){
		while(tree.hasNext()){
			EObject next = tree.next();
				if(next instanceof Function){
				String fName = ((Function) next).getName();
				if(!(functionMap.containsKey(fName))){
					functionMap.put(fName, new FunctionEnvironment((Function) next));
				}else{
					//Générer une erreur de type (cette fonction existe déjà)
				}
			}				
		}
	}
	
	public String toString(){
		return functionMap.toString();
	}
	
}
