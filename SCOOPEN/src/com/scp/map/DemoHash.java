package com.scp.map;

public class DemoHash implements Comparable<DemoHash>, Cloneable {

	private int num;
	private String Dept;
	private AddressForHash add;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Dept == null) ? 0 : Dept.hashCode());
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + num;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoHash other = (DemoHash) obj;
		if (Dept == null) {
			if (other.Dept != null)
				return false;
		} else if (!Dept.equals(other.Dept))
			return false;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (num != other.num)
			return false;
		return true;
	}



	public DemoHash(int num, String dept, AddressForHash add) {
		super();
		this.num = num;
		Dept = dept;
		this.add = add;
	}

	

	@Override
	public String toString() {
		return "\n DemoHash [num=" + num + ", Dept=" + Dept + ", add=" + add + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public AddressForHash getAdd() {
		return add;
	}

	public void setAdd(AddressForHash add) {
		this.add = add;
	}

	@Override
	public int compareTo(DemoHash o) {

		// TODO Auto-generated method stub
		return this.getAdd().getMy1().getName().compareToIgnoreCase(o.getAdd().getMy1().getName());
	}

	protected DemoHash clone() throws CloneNotSupportedException {
		DemoHash clonDemo = (DemoHash) super.clone();
		AddressForHash clonAdd =  clonDemo.getAdd().clone();
		clonDemo.setAdd(clonAdd);
		return clonDemo;

		
	}

}
