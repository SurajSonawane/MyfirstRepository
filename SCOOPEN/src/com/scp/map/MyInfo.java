package com.scp.map;

public class MyInfo implements Comparable<MyInfo>, Cloneable {
	private int Age;
	private String Name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
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
		MyInfo other = (MyInfo) obj;
		if (Age != other.Age)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "\n MyInfo [Age=" + Age + ", Name=" + Name + "]";
	}


	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public MyInfo(int age, String name) {
		super();
		Age = age;
		Name = name;
	}

	@Override
	public int compareTo(MyInfo o) {
		// TODO Auto-generated method stub
		return this.Name.compareTo(o.Name);
	}

	protected MyInfo clone() throws CloneNotSupportedException {
		return (MyInfo) super.clone();

	}

}
