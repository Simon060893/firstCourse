package com.midgarb.day7.f09;

import java.nio.channels.IllegalSelectorException;
import java.util.Iterator;

public class SimpleLinkedList implements Iterable<Object> {
	private Node root;
	private int size;

	public SimpleLinkedList() {
		size = 0;
	}

	public int getSize() {
		return size;

	}

	public void addFirst(Object ob) {
		Node r = new Node();
		r.o = ob;
		if (root != null) {
			r.ref = root;
		}
		root = r;
		size++;
	}

	public void addLast(Object a) {
		Node r = new Node();
		r.o = a;
		if (root == null) {
			root = r;
		} else {
			Node last = root;
			Node cp = root;
			while (cp.ref != null) {
				cp = cp.ref;
				last = cp;
			}
			last.ref = r;
		}
		size++;
	}

	public void addAfter(Object as, Object prev) {
		Node previousPointer = null;
		Node cp = root;
		do {
			if (cp.o == as) {
				previousPointer = cp;
				break;
			}
			cp = cp.ref;

		} while (cp != null && cp.o != null);
		if (previousPointer == null) {
			throw new IllegalStateException("It is not that object in list");
		}
		Node n = new Node();
		n.o = prev;
		if (previousPointer.ref != null) {
			n.ref = previousPointer.ref;
		}
		previousPointer.ref = n;
		size++;
	}

	public void printList() {
		System.out.print("{ ");
		Node cp = root;
		System.out.print(cp.o + " ");
		do {
			// if(cp.o != null){
			
			cp = cp.ref;
			if (cp == null) {
				break;
			}
			
			System.out.print(cp.o + " ");
		}while (cp.ref != null);
		System.out.println(" }");
	}
//--------Inner class Node 
	private class Node {
		Object o;
		Node ref;
	}
//---------Inner class SLLIterator
	class SLLIterator implements Iterator<Object> {
		private Node cp;
		private Node prev;

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			//onle one element
			if(!hasNext() && prev == null){
				 cp = null;
				 root= null;	
			}
			//last element
			else if(!hasNext() && prev != null){
				prev.ref= null;
				cp = null;
				 	
			}
			//first element
			else if(hasNext() && prev == null){
				 root=cp.ref;
				 cp= root;
			}
			//element in the middle
			else{
				prev.ref = cp.ref;
				cp= cp.ref;
			}
			size--;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (cp == null && root != null)
					|| (cp != null && cp.ref != null);
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(cp==null&&root!=null){
				cp=root;
				return cp.o;
			}
			if(hasNext()){
				prev = cp;
				cp=cp.ref;
				return cp.o;
			}
			throw new IllegalStateException("List has no more alements");
		}
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new SLLIterator();
	}

	public boolean hasNext() {
		Node cp = root;
		while (cp.ref != null) {
			cp = cp.ref;
			return true;
		}
		return false;

	}

	public boolean next() {
		Node cp = root;
		if (cp.ref != null) {
			return true;
		}
		return false;

	}

}
