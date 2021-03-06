/*
 * generated by Xtext 2.10.0
 */
grammar InternalWh;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.comp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.comp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.comp.services.WhGrammarAccess;

}
@parser::members {
	private WhGrammarAccess grammarAccess;

	public void setGrammarAccess(WhGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleWh
entryRuleWh
:
{ before(grammarAccess.getWhRule()); }
	 ruleWh
{ after(grammarAccess.getWhRule()); } 
	 EOF 
;

// Rule Wh
ruleWh 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWhAccess().getElementsAssignment()); }
		(rule__Wh__ElementsAssignment)*
		{ after(grammarAccess.getWhAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProgram
entryRuleProgram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinition
entryRuleDefinition
:
{ before(grammarAccess.getDefinitionRule()); }
	 ruleDefinition
{ after(grammarAccess.getDefinitionRule()); } 
	 EOF 
;

// Rule Definition
ruleDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup()); }
		(rule__Definition__Group__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInput
entryRuleInput
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputAccess().getGroup()); }
		(rule__Input__Group__0)
		{ after(grammarAccess.getInputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOutput
entryRuleOutput
:
{ before(grammarAccess.getOutputRule()); }
	 ruleOutput
{ after(grammarAccess.getOutputRule()); } 
	 EOF 
;

// Rule Output
ruleOutput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOutputAccess().getGroup()); }
		(rule__Output__Group__0)
		{ after(grammarAccess.getOutputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommands
entryRuleCommands
:
{ before(grammarAccess.getCommandsRule()); }
	 ruleCommands
{ after(grammarAccess.getCommandsRule()); } 
	 EOF 
;

// Rule Commands
ruleCommands 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandsAccess().getGroup()); }
		(rule__Commands__Group__0)
		{ after(grammarAccess.getCommandsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommand
entryRuleCommand
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandAccess().getCmdAssignment()); }
		(rule__Command__CmdAssignment)
		{ after(grammarAccess.getCommandAccess().getCmdAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNop
entryRuleNop
:
{ before(grammarAccess.getNopRule()); }
	 ruleNop
{ after(grammarAccess.getNopRule()); } 
	 EOF 
;

// Rule Nop
ruleNop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNopAccess().getNopAssignment()); }
		(rule__Nop__NopAssignment)
		{ after(grammarAccess.getNopAccess().getNopAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAffect
entryRuleAffect
:
{ before(grammarAccess.getAffectRule()); }
	 ruleAffect
{ after(grammarAccess.getAffectRule()); } 
	 EOF 
;

// Rule Affect
ruleAffect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAffectAccess().getGroup()); }
		(rule__Affect__Group__0)
		{ after(grammarAccess.getAffectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpr
entryRuleExpr
:
{ before(grammarAccess.getExprRule()); }
	 ruleExpr
{ after(grammarAccess.getExprRule()); } 
	 EOF 
;

// Rule Expr
ruleExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExprAccess().getExprSimpleParserRuleCall()); }
		ruleExprSimple
		{ after(grammarAccess.getExprAccess().getExprSimpleParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExprSimple
entryRuleExprSimple
:
{ before(grammarAccess.getExprSimpleRule()); }
	 ruleExprSimple
{ after(grammarAccess.getExprSimpleRule()); } 
	 EOF 
;

// Rule ExprSimple
ruleExprSimple 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExprSimpleAccess().getAlternatives()); }
		(rule__ExprSimple__Alternatives)
		{ after(grammarAccess.getExprSimpleAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__CmdAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0()); }
		ruleNop
		{ after(grammarAccess.getCommandAccess().getCmdNopParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1()); }
		ruleAffect
		{ after(grammarAccess.getCommandAccess().getCmdAffectParserRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExprSimple__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExprSimpleAccess().getNilKeyword_0()); }
		'nil'
		{ after(grammarAccess.getExprSimpleAccess().getNilKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getExprSimpleAccess().getVARIABLETerminalRuleCall_1()); }
		RULE_VARIABLE
		{ after(grammarAccess.getExprSimpleAccess().getVARIABLETerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getFunctionKeyword_0()); }
	'function'
	{ after(grammarAccess.getProgramAccess().getFunctionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getNameAssignment_1()); }
	(rule__Program__NameAssignment_1)
	{ after(grammarAccess.getProgramAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
	rule__Program__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getProgramAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getDefinitionAssignment_3()); }
	(rule__Program__DefinitionAssignment_3)
	{ after(grammarAccess.getProgramAccess().getDefinitionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Definition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__0__Impl
	rule__Definition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); }
	'read'
	{ after(grammarAccess.getDefinitionAccess().getReadKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__1__Impl
	rule__Definition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getInputAssignment_1()); }
	(rule__Definition__InputAssignment_1)
	{ after(grammarAccess.getDefinitionAccess().getInputAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__2__Impl
	rule__Definition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); }
	'%'
	{ after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__3__Impl
	rule__Definition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getCommandAssignment_3()); }
	(rule__Definition__CommandAssignment_3)
	{ after(grammarAccess.getDefinitionAccess().getCommandAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__4__Impl
	rule__Definition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); }
	'%'
	{ after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__5__Impl
	rule__Definition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); }
	'write'
	{ after(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getOutputAssignment_6()); }
	(rule__Definition__OutputAssignment_6)
	{ after(grammarAccess.getDefinitionAccess().getOutputAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__0__Impl
	rule__Input__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getVarsAssignment_0()); }
	(rule__Input__VarsAssignment_0)
	{ after(grammarAccess.getInputAccess().getVarsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getGroup_1()); }
	(rule__Input__Group_1__0)*
	{ after(grammarAccess.getInputAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group_1__0__Impl
	rule__Input__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getInputAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getVarsAssignment_1_1()); }
	(rule__Input__VarsAssignment_1_1)
	{ after(grammarAccess.getInputAccess().getVarsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Output__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__0__Impl
	rule__Output__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getVarsAssignment_0()); }
	(rule__Output__VarsAssignment_0)
	{ after(grammarAccess.getOutputAccess().getVarsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getGroup_1()); }
	(rule__Output__Group_1__0)*
	{ after(grammarAccess.getOutputAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Output__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group_1__0__Impl
	rule__Output__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getVarsAssignment_1_1()); }
	(rule__Output__VarsAssignment_1_1)
	{ after(grammarAccess.getOutputAccess().getVarsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Commands__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commands__Group__0__Impl
	rule__Commands__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommandsAccess().getCommandsAssignment_0()); }
	(rule__Commands__CommandsAssignment_0)
	{ after(grammarAccess.getCommandsAccess().getCommandsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commands__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommandsAccess().getGroup_1()); }
	(rule__Commands__Group_1__0)*
	{ after(grammarAccess.getCommandsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Commands__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commands__Group_1__0__Impl
	rule__Commands__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); }
	';'
	{ after(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Commands__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1()); }
	(rule__Commands__CommandsAssignment_1_1)
	{ after(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Affect__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group__0__Impl
	rule__Affect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getVarsAssignment_0()); }
	(rule__Affect__VarsAssignment_0)
	{ after(grammarAccess.getAffectAccess().getVarsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group__1__Impl
	rule__Affect__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getGroup_1()); }
	(rule__Affect__Group_1__0)*
	{ after(grammarAccess.getAffectAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group__2__Impl
	rule__Affect__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getColonEqualsSignKeyword_2()); }
	':='
	{ after(grammarAccess.getAffectAccess().getColonEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group__3__Impl
	rule__Affect__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getExprsAssignment_3()); }
	(rule__Affect__ExprsAssignment_3)
	{ after(grammarAccess.getAffectAccess().getExprsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getGroup_4()); }
	(rule__Affect__Group_4__0)*
	{ after(grammarAccess.getAffectAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Affect__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group_1__0__Impl
	rule__Affect__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getAffectAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getVarsAssignment_1_1()); }
	(rule__Affect__VarsAssignment_1_1)
	{ after(grammarAccess.getAffectAccess().getVarsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Affect__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group_4__0__Impl
	rule__Affect__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getAffectAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Affect__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAffectAccess().getExprsAssignment_4_1()); }
	(rule__Affect__ExprsAssignment_4_1)
	{ after(grammarAccess.getAffectAccess().getExprsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Wh__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0()); }
		ruleProgram
		{ after(grammarAccess.getWhAccess().getElementsProgramParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__DefinitionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_3_0()); }
		ruleDefinition
		{ after(grammarAccess.getProgramAccess().getDefinitionDefinitionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__InputAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0()); }
		ruleInput
		{ after(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__CommandAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getCommandCommandsParserRuleCall_3_0()); }
		ruleCommands
		{ after(grammarAccess.getDefinitionAccess().getCommandCommandsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__OutputAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0()); }
		ruleOutput
		{ after(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__VarsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0()); }
		RULE_VARIABLE
		{ after(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__VarsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); }
		RULE_VARIABLE
		{ after(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__VarsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0()); }
		RULE_VARIABLE
		{ after(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__VarsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); }
		RULE_VARIABLE
		{ after(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__CommandsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0()); }
		ruleCommand
		{ after(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Commands__CommandsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0()); }
		ruleCommand
		{ after(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__CmdAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandAccess().getCmdAlternatives_0()); }
		(rule__Command__CmdAlternatives_0)
		{ after(grammarAccess.getCommandAccess().getCmdAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Nop__NopAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNopAccess().getNopNopKeyword_0()); }
		(
			{ before(grammarAccess.getNopAccess().getNopNopKeyword_0()); }
			'nop'
			{ after(grammarAccess.getNopAccess().getNopNopKeyword_0()); }
		)
		{ after(grammarAccess.getNopAccess().getNopNopKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__VarsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_0_0()); }
		RULE_VARIABLE
		{ after(grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__VarsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); }
		RULE_VARIABLE
		{ after(grammarAccess.getAffectAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__ExprsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_3_0()); }
		ruleExpr
		{ after(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Affect__ExprsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_4_1_0()); }
		ruleExpr
		{ after(grammarAccess.getAffectAccess().getExprsExprParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_VARIABLE : 'A'..'Z' RULE_ID;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
