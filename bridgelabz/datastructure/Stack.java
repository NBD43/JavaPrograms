/******************************************************************************
 *  Purpose: To perform stack operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   22-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class Stack {
	int capacity=2;
	int stack[]=new int[5];
	int top=0;
	
	public void push(int data) {
		if(size()==capacity) {
			expand();
		}
		stack[top]=data;
		top++;
	}
	public int pop()
	{
		int data = 0;
		
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			top--;
			data=stack[top];
			stack[top]=0;
			shrink();
		}
		
		return data;
		
	}
	
	public void show() {
		for(int n:stack) {
			System.out.print(n+ " ");
		}
	}
	public void expand() {
		int length=size();
		int newStack[]=new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		capacity=capacity*2;
		
	}
	public void shrink() {
		int length=size();
		if(length<=(capacity/2)/2)
			capacity=capacity/2;
		int newStack[]=new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	public int peak() {
		int data;
		data=stack[top-1];
		return data;
	}

	public int size() {
		// TODO Auto-generated method stub
		return top;
	}
	

}
