package com.midgarb.day7.hw1;

import java.util.Iterator;

public class SimpleArrayList implements Iterable {
	private Object[] o;

	public SimpleArrayList(int i) {
		o = new Object[i];
	}

	public void addFirst(Object obj) {

		if (o[0] != null && o[o.length - 1] == null) {

			for (int i = o.length - 1; i > 0; i--) {
				Object c = o[i];
				if (i - 1 > -1) {
					o[i] = o[i - 1];
					o[i - 1] = c;
				}
			}

		} else if (o[o.length - 1] != null) {
			throw new IllegalStateException("You cann`t add more elements");
		}

		o[0] = obj;
	}

	// -----add object after not null elements
	public void addLast(Object obj) {
		if (o[o.length - 1] != null) {
			throw new IllegalStateException("You cann`t add more elements");
		} else {
			for (int i = 0; i < o.length; i++) {
				if (o[i] == null) {
					o[i] = obj;
					break;
				}
			}
		}
	}

	// ------add object at the last collection while our collection have a null
	// elements
	public void addLast1(Object obj) {
		int notnull = 0;
		for (int i = 0; i < o.length; i++) {
			if (o[i] == null) {
				notnull += i;
				break;
			}
		}
		if (notnull == 0) {
			throw new IllegalStateException("You cann`t add more elements");
		} else if (o[o.length - 1] != null) {
			for (int i1 = o.length - 1; i1 > notnull; i1--) {
				Object c = o[i1];
				if (i1 - 1 >= notnull) {
					o[i1] = o[i1 - 1];
					o[i1 - 1] = c;
				}
			}

		}
		o[o.length - 1] = obj;

	}

	// ///----if we use remove1(obj),  add object before not null position 
	public void addFirst1(Object obj) {
		int notnull = 0;
		int notnull1 = 0;
		for (int i = 0; i < o.length; i++) {
			if (o[i] != null) {
				notnull += i;
				break;
			}
		}
		for (int i = o.length - 1; i > 0; i--) {
			if (o[i] != null) {
				notnull1 += i;
				break;
			}
		}
		if (notnull == 0 && notnull1 == 0) {
			throw new IllegalStateException("You cann`t add more elements");
		} else if (notnull != 0) {
			for (int i1 = 0; i1 < notnull; i1++) {
				Object c = o[i1];
				if (i1 + 1 <= notnull) {
					o[i1] = o[i1 + 1];
					o[i1 + 1] = c;
				}
			}
			o[notnull] = obj;
		} else if (notnull1 != 0) {
			addFirst(obj);
		}
	}

	// -----if our collection have a null in any place we can add a object after
	// choosed place
	public void addAfter(Object obj, Object add) {
		Object c = ";";
		int k1 = 0;
		for (int i = 0; i < o.length; i++) {
			if (o[i] == null) {
				c = o[i];
				k1 = i;
			}
			if (o[i] != null && o[i].equals(obj)) {
				if (c != null) {
					for (int k = i; k < o.length; k++) {
						if (o[k] == null) {
							c = o[k];
							while (i + 1 != k) {
								o[k] = o[k - 1];
								o[k - 1] = c;
								k--;
							}
							break;

						} else if (c == c && o[o.length - 1] != null) {
							throw new IllegalStateException(
									"You cann`t add more elements");
						}

					}
					o[i + 1] = add;
					return;

				} else {
					for (int j = k1; j < i; j++) {
						o[j] = o[j + 1];
						o[j + 1] = c;
					}
					o[i + 1] = add;
					return;
				}

			} else if (i + 1 > o.length && o[i].equals(obj) == false) {
				throw new IllegalStateException("You cann`t add more elements");
			}

		}
		for (int i = 0; i < o.length; i++) {
			if (o[i].equals(obj) == false) {
				throw new IllegalStateException(
						"You cann`t add your elements not exist element in collection");
			}
		}

	}

	// --------delete object with change a place of object in a collections
	public void remove2(Object obj) {
		for (int i = 0; i < o.length; i++) {
			if (o[i] != null && o[i].equals(obj) && i + 1 < o.length) {

				o[i] = o[i + 1];
				o[i + 1] = null;

			}
		}
		for (int i = 0; i < o.length; i++) {
			if (!o[i].equals(obj)) {

				throw new IllegalStateException("You cann`t delete this object");
			}
		}
	}

	// ------delete object without change a place of object in a collections
	public void remove1(Object obj) {
		for (int i = 0; i < o.length; i++) {
			if (o[i].equals(obj)) {
				o[i] = null;
				break;
			}
		}
	}

	public void printList() {
		for (Object o1 : o) {
			System.out.println(o1);
		}
	}

	public class SALIterator implements Iterator<Object> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			Object c="";
			for(int i = 0; i <o.length;i++){
				if( o[i]==null){
					c=o[i];
					break;
				}
			}
			return (o.length>1 && o.length>0 && c!=null);
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			for (int i = 0; i < o.length; i++) {
				if (o[i + 1] == null) {
					o[i] = null;
					break;
				}
			}
		}

	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new SALIterator();
	}
}
