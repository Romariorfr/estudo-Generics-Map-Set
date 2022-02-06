package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {

	private List<Type> list = new ArrayList<>();

	public PrintService() {

	}

	public List<Type> getList() {
		return list;
	}

	public void addValue(Type value) {
		list.add(value);
	}

	public Type first() {
		return list.get(0);
	}

	public void print() {
		System.out.println(list);
		System.out.println("First element: " + first());
	}

	@Override
	public String toString() {
		return "PrintService [list=" + list + "]";
	}

}
