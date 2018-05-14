package Prototype;

import java.util.*;

public class Employee implements Cloneable {

	private List<String> emplist;

	public Employee() {
		emplist = new ArrayList<String>();
	}

	public Employee(List<String> emp) {
		this.emplist = emp;
	}

	public List<String> getEmpList() {
		return emplist;
	}

	public void loadData() {
		emplist.add("Vishal");
		emplist.add("Venu");
		emplist.add("SaiRam");
		emplist.add("Manikya");
	}

	public Object clone() {

		List<String> temp = new ArrayList<String>();
		for (String s : emplist) {
			temp.add(s);
		}
		return new Employee(temp);
	}

}
