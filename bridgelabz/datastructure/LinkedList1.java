/******************************************************************************
 * 
 *  
 *  Purpose: To perform linked list operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   22-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class LinkedList1<T> {
	Node<T> head;
	public void insert(T data) {
		Node<T> node=new Node();
		node.data= data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	public void show() {
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public void insertAtStart(T data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	
	public void insertAt(int index,T data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		if(index==0) {
			insertAtStart(data);
		}else {
		
			for (int i=0;i<index-1;i++) {
				 n=n.next;
			
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAt(int index) {
		if(index==0)
		{
			head=head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			//System.out.println("n1:"+n1.data);
			n1=null;
		
			
		}
	}

}
