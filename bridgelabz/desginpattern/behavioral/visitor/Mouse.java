package com.bridgelabz.desginpattern.behavioral.visitor;

public class Mouse implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}