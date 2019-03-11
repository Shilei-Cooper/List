package com.shilei.test310;

import java.util.LinkedList;

public class testLinkedList <E>{
	private Node first;
	private Node last;
	private int size;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		testLinkedList<String> tLL=new testLinkedList();
		tLL.add("c0");
		tLL.add("c1");
		tLL.add("c2");
		tLL.add("c3");
		tLL.add("c4");
		tLL.add("c5");
		tLL.add("c6");
		tLL.add("c7");
		tLL.add("c8");
		tLL.add("c9");
		tLL.add("c10");
		tLL.add("c11");
		tLL.add("c12");
		tLL.add("c13");
		System.out.println(tLL.toString());
//		tLL.remove(13);
//		tLL.remove(0);
		tLL.add(0, "ddd");
		System.out.println(tLL.toString());
		//System.out.println(tLL.get(11));


	}

	public Object get(int index) {
		Node temp=getNode(index);		
		return temp.element;		
	}
	public void add(int index,E e) {
		Node temp=getNode(index);
		Node node=new Node(e);
	if(temp.previous==null) {
		this.first=node;
		temp.previous=first;
		first.next=temp;
	}
	else {
		node.previous=temp.previous;
		node.next=temp;
		temp.previous.next=node;
		}
	}
	public void remove(int index) {
		Node temp=getNode(index);
		if(temp.previous==null) {
			this.first=temp.next;
		}else if(temp.next==null){
			temp.previous.next=null;
		}else {
			temp.previous.next=temp.next;
			temp.next.previous=temp.previous;
		}
	}

	public Node getNode(int index) {
		Node temp;
		if(index<(size>>1)) {
			temp=first;
			for(int i=0;i<index;i++) {
				temp=temp.next;	
			}

		}else {
			temp=last;
			for(int i=size-1;i>index;i--) {
				temp=temp.previous;

			}
		}		
		return temp;
	}

	public String toString() {
		StringBuilder sB=new StringBuilder();
		Node temp=first;
		sB.append("[");
		while(temp!=null) {
			sB.append(temp.element+",");
			temp=temp.next;
		}
		sB.setCharAt(sB.length()-1, ']');
		return sB.toString();

	}
	public void add (E e) {

		Node<E> node=new Node<E>(e);
		if(first==null) {
			first=node;
			last=node;
		}else {
			node.previous=last;
			node.next=null;
			last.next=node;
			last=node;
		}
		size++;
	}


}
