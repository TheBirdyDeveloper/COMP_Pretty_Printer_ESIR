/*
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.comp.wh.Command
import org.xtext.comp.wh.Commands
import org.xtext.comp.wh.Definition
import org.xtext.comp.wh.Input
import org.xtext.comp.wh.Output
import org.xtext.comp.wh.Program
import org.xtext.comp.wh.Wh
import org.xtext.comp.wh.impl.AffectImpl
import org.xtext.comp.wh.impl.NopImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WhGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (file : resource.allContents.toIterable.filter(Wh)) {
        	fsa.generateFile("f.whpp", file.prettyPrint)
    	}
	}
	
	def void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String outputName) {
		for (file : resource.allContents.toIterable.filter(Wh)) {
        	fsa.generateFile(outputName, file.prettyPrint)
    	}
	}
	
	def prettyPrint(Wh file)'''
	�FOR prog : file.elements�
	�prog.prettyPrint�
	
	�ENDFOR�
	'''
	
	
	def prettyPrint(Program p) '''
            function �p.name�:
            �p.definition.prettyPrint�
        '''
                 
    def prettyPrint(Definition d) ''' 
    	read �d.input.prettyPrint�
    	%
    	    �d.command.prettyPrint�
    	%
    	write �d.output.prettyPrint�
    '''
    
    def prettyPrint(Input i) {
    	return printList(i.vars,",")    
    }
    
    def prettyPrint(Output o){
    	return printList(o.vars,",")
    }
    
    def String prettyPrint(Commands cmds){
    	var res = "";
    	if(cmds.commands.size > 1){
    		for(i:0..cmds.commands.size-2){
    			res += cmds.commands.get(i).prettyPrint+" ;\n"
    		}
    	}
    	res += cmds.commands.get(cmds.commands.size-1).prettyPrint
    	return res
    }
    
    def prettyPrint(Command c) {
    	if( c.cmd instanceof NopImpl ) {
    		return (c.cmd as NopImpl).prettyPrint
       	} 
       	
       	if( c.cmd instanceof AffectImpl ) {
    		return (c.cmd as AffectImpl).prettyPrint
       	}
    }
    
    def prettyPrint( NopImpl n ) '''�n.nop�'''
    
    def String prettyPrint(AffectImpl a) {
    	var res = printList(a.vars,",")
    	res += " := "
    	res += printList(a.exprs,",")
    	
    	return res
    }
    
    def String printList(EList<String> list, String delim){
    	var res = ""
    	if(list.size > 1){
    		for(i:0..list.size-2){
    			res+= list.get(i)+delim
    		}
    	}
    	res += list.get(list.size-1)
    	
    	return res
    }
}



