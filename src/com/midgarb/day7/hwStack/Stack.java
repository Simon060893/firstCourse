package com.midgarb.day7.hwStack;

public class Stack {
	private Object[] obj;
	int j;//size of stack

	public Stack(int i) {
		if (i == 0) {
			throw new IllegalStateException("Cann`t create a Stack");
		}
		obj = new Object[i];
		this.j = i;
	}

	public void push(Object o) {
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] == null) {
				obj[i] = o;
				return;
			} else if (i == j - 1) {
				Object c;
				for (int g = 0; g < obj.length; g++) {
					c = obj[g];
					if (g + 1 < obj.length) {
						obj[g] = obj[g + 1];
						obj[g + 1] = c;
					}
				}
				obj[i] = o;
			}
		}
	}

	public void pop(Object o) {
		for(int i = 0; i<j;i++){
			if(obj[i].equals(o)){

				obj[i]=null;
				while(i+1<j){

			obj[i] = obj[i+1];
			obj[i+1] = null;
			i++;

			}
			}
		}
	}

	public Object peak(Object o) {
		for(int i = 0; i<j;i++){
			if(obj[i] != null && obj[i].equals(o)){
				return obj[i];
			}
		}
		return "Cann`t search those element";

	}

	public void print() {
		for (Object g : obj) {
			System.out.println(g);
		}
	}

}
