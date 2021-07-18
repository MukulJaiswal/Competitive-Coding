package com.corejava.concept;

import java.util.HashMap;

/**
 * https://howtodoinjava.com/java/collections/hashmap/design-good-key-for-hashmap/
 * 
 * @author Mukul
 *
 */
class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Employee acc = (Employee) obj;
		if (acc.getId() == this.id) {
			return true;
		}
		return false;
	}
}

public class ObjectAsKeyHashMap {
	public static void main(String[] args) {
		Employee e1 = new Employee("mukul", 100);
		Employee e2 = new Employee("james", 101);

		HashMap<Employee, String> map = new HashMap<Employee, String>();
		map.put(e1, "manager");
		map.put(e2, "accountant");

		// Changing its value will also change the hashcode because when state of an
		// object is changed then its HashCode is also recomputed.
		// and it is unable to fetch the original record.
		map.put(e1, "M1");
		map.put(e2, "A1");

		map.get(e1);
		System.out.println(map.get(e1));

		System.out.println(map);
	}
}
